package com.amino.delivery.delivery_service.order;

import com.amino.delivery.delivery_service.product.Product;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_orders_items")
public class OrderItem {
    @Id
    private String id; // Delivery Item ID
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order; // ID of the order this item belongs to
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product; // ID of the product being delivered
    private String specialInstructions; // Any special instructions for the delivery item
    private int quantity; // Quantity of the product
    private double unitPrice; // Price of the product
    private double subtotal;
    private String status; // Status of the delivery item (e.g., "pending", "delivered", etc.)
    private LocalDateTime createdAt; // Time when the item was created

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
