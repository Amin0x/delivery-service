package com.amino.delivery.delivery_service.cart;

import com.amino.delivery.delivery_service.product.ProductRepository;
import com.amino.delivery.delivery_service.users.User;
import com.amino.delivery.delivery_service.users.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CartService {
    private final CartRepository cartRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public CartService(CartRepository cartRepository, UserRepository userRepository,
                       ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    public CartDto getCart(String userId){
        User user = userRepository.findById(userId).orElseThrow();
        Cart cart = cartRepository.findByUser(user).orElseThrow();
        return toDto(cart);
    }

    public CartDto addToCart(String userId, String productId, int quantity){
        User user = userRepository.findById(userId).orElseThrow();
        Cart cart = cartRepository.findByUser(user).orElse(null);
        if (cart == null){
            cart = createUserCart(user);
        }
        Optional<CartItem> first = cart.getCartItems().stream()
                .filter(i -> i.getProduct().getId().equals(productId))
                .findFirst();

        if (first.isPresent()){
            CartItem cartItem = first.get();
            cartItem.setQuantity(cartItem.getQuantity() + quantity);

        } else {
            CartItem cartItem = new CartItem();
            cartItem.setCart(cart);
            cartItem.setProduct(productRepository.findById(productId).orElseThrow());
            cartItem.setQuantity(quantity);
            cart.getCartItems().add(cartItem);
        }

        double subtotal = cart.getCartItems().stream()
                .mapToDouble(i -> i.getProduct().getPrice() * i.getQuantity())
                .sum();
        cart.setSubtotal(subtotal);
        cart.setDiscount(0);
        cart.setTax(cart.getSubtotal() * 0.2);
        cart.setTotal(0);
        cart = cartRepository.save(cart);

        return null;
    }



    public CartDto removeFromCart(String userId, String productId){
        User user = userRepository.findById(userId).orElseThrow();
        Cart cart = cartRepository.findByUser(user).orElseThrow();

        cart.getCartItems()
                .stream()
                .filter(i -> i.getProduct().getId().equals(productId))
                .findFirst()
                .ifPresent(i -> cart.getCartItems().remove(i));

        var saved = cartRepository.save(cart);

        return toDto(saved);
    }

    public CartDto updateCart(String userId, String productId, int quantity){
        if (quantity == 0)
            removeFromCart(userId, productId);

        User user = userRepository.findById(userId).orElseThrow();
        Cart cart = cartRepository.findByUser(user).orElseThrow();
        cart.getCartItems().stream().filter(i -> i.getProduct().getId().equals(productId))
                .findFirst().ifPresent(i -> {
                    i.setQuantity(quantity);
                });

        double subtotal = cart.getCartItems().stream()
                .mapToDouble(i -> i.getProduct().getPrice() * i.getQuantity())
                .sum();
        cart.setSubtotal(subtotal);
        cart.setDiscount(0);
        cart.setTax(cart.getSubtotal() * 0.2);
        cart.setTotal(0);
        var saved = cartRepository.save(cart);

        return toDto(saved);
    }

    private CartDto toDto(Cart cart) {
        return null;
    }

    private Cart createUserCart(User user) {
        Cart cart;
        cart = new Cart();
        cart.setUser(user);
        cart.setUpdatedAt(LocalDateTime.now());
        cartRepository.save(cart);
        return cart;
    }
}
