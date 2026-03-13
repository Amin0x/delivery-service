package com.amino.delivery.delivery_service.order;

import com.amino.delivery.delivery_service.cart.Cart;
import com.amino.delivery.delivery_service.cart.CartRepository;
import com.amino.delivery.delivery_service.product.Product;
import com.amino.delivery.delivery_service.product.ProductRepository;
import com.amino.delivery.delivery_service.users.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final OrderItemRepository orderItemRepository;
    private final CartRepository cartRepository;

    public OrderService(OrderRepository orderRepository, ProductRepository productRepository, OrderItemRepository orderItemRepository,
                        CartRepository cartRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.orderItemRepository = orderItemRepository;
        this.cartRepository = cartRepository;
    }

    public Optional<Order> findById(String orderId){
        if (orderId == null){
            throw new RuntimeException("");
        }

        return orderRepository.findById(orderId);
    }

    public OrderDto createOrderFromCart(User user) {
        Cart cart = cartRepository.findByUser(user).orElseThrow();
        Order order = new Order();
        order.setId(null);

        List<OrderItem> orderItems = cart.getCartItems().stream().map(c -> {
            OrderItem orderItem = new OrderItem();
            orderItem.setStatus("Pending");
            orderItem.setOrder(order);
            orderItem.setProduct(c.getProduct());
            orderItem.setCreatedAt(LocalDateTime.now());
            orderItem.setQuantity(c.getQuantity());
            orderItem.setSpecialInstructions("");
            orderItem.setSubtotal(c.getQuantity() * c.getProduct().getPrice());
            orderItem.setUnitPrice(c.getProduct().getPrice());
            return orderItem;
        }).toList();

        order.setOrderItems(orderItems);
        order.setSubtotal(orderItems.stream().mapToDouble(OrderItem::getSubtotal).sum());
        order.setTax(0);
        order.setDiscount(0);
        order.setTotalAmount(order.getSubtotal() + order.getTax() - order.getDiscount());
        order.setCreatedAt(LocalDateTime.now());
        order.setUpdatedAt(LocalDateTime.now());
        order.setStatus("Pending");
        order.setPaymentMethod("Cash");
        order.setPaymentStatus("pending");
        order.setCustomerId("");
        order.setEstimatedDeliveryTime(0);
        order.setActualDeliveryTime(0);
        order.setDeliveryFee(0.0);
        order.setEstimatedDeliveryTime(0);
        order.setDeliveryFee(0.0);
        order.setDeliveryAddressId("");
        order.setDeliveryTime(null);
        order.setPickupTime(null);
        order.setRestaurantLocation("");
        order.setSpecialInstructions("");
        Order created = orderRepository.save(order);
        return toDto(created);
    }

    public Order trackDelivery(String orderId) {
        return null;
    }

    public void cancelOrder(String orderId) {
        if (orderId == null || orderId.isBlank()){
            throw new RuntimeException("");
        }

        Order order = orderRepository.findByOrderId(orderId);
        if (order == null){
            throw new RuntimeException("");
        }
        order.setStatus("CANCELED");
        order.setUpdatedAt(LocalDateTime.now());
        orderRepository.save(order);
        return;
    }

    private void addItem(Order order, Product product, int quantity){

        if (order == null || product == null){
            throw new RuntimeException("");
        }

        OrderItem orderItem = orderItemRepository.findByOrderAndProduct(order.getOrderId(), product.getId()).orElse(null);
        if (orderItem == null) {
            orderItem = new OrderItem();
            orderItem.setOrder(order);
            orderItem.setProduct(product);
            orderItem.setCreatedAt(LocalDateTime.now());
            order.getOrderItems().add(orderItem);
        }

        orderItem.setUnitPrice(product.getPrice());
        orderItem.setQuantity(orderItem.getQuantity() + quantity);
        orderItem.setSubtotal(product.getPrice() * orderItem.getQuantity());

        //update order
        order.setSubtotal(1000);
        order.setTax(1000 * 0.2);
        order.setTotalAmount(order.getSubtotal() + order.getTax() - order.getDiscount());
        orderRepository.save(order);
    }

    public void removeProductItem(String orderId, String productId){
        if (orderId == null || orderId.isBlank()){
            throw new RuntimeException("");
        }

        Order order = orderRepository.findByOrderId(orderId);
        if (order == null) {
            throw new RuntimeException("");
        }

        Product product = productRepository.findById(productId).orElse(null);
        if (product == null) {
            throw new RuntimeException("");
        }

        OrderItem orderItem = orderItemRepository.findByOrderAndProduct(order.getOrderId(), product.getId()).orElse(null);
        if (orderItem == null){
            throw new RuntimeException("");
        }

        orderItemRepository.delete(orderItem);
    }

    public void updateDeliveryLocation(String deliveryId, String location) {

    }

    public void updateDeliveryStatus(String deliveryId, String status) {

    }

    public void makePayment(){
        Payment payment = new Payment();
        Order order;
        payment.setOrder(order);
        order.getPayments().add(payment);
        orderRepository.save(order);
    }

    private OrderDto toDto(Order order){
        return null;
    }

    private Order fromDto(OrderDto order){
        return null;
    }
}
