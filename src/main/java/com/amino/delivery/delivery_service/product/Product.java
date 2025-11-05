package com.amino.delivery.delivery_service.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Product {
    @Id
    private String id;
    private String restaurantId;
    private String restaurantBranchId; // if null, it means the product is available for all branches
    private String productName;
    private String productType;
    private Double price;
    private String status; // active, inactive
    private String productImage; // URL of the product image
    private String productDescription; // Description of the product
    private String productCategory; // Category of the product
    private String productSubCategory; // Sub-category of the product
    private String productTags; // Tags associated with the product
    private String productAllergenInfo; // Allergen information for the product
    private String productNutritionalInfo; // Nutritional information for the product
    private String productPreparationTime; // Estimated preparation time for the product
    private String productServingSize; // Serving size of the product
    private String productDietaryInfo; // Dietary information for the product
    private String productIngredients; // Ingredients used in the product
    private String productStorageInstructions; // Storage instructions for the product
    private String productCookingInstructions; // Cooking instructions for the product
    private String productServingSuggestions; // Serving suggestions for the product
    private String productPairingSuggestions; // Pairing suggestions for the product
    private String productPromotions; // Promotions associated with the product
    private String productAvailability; // Availability status of the product
    private String productDiscount; // Discount information for the product
    private String productRating; // Average rating of the product
    private String productReviews; // Reviews for the product
    private String productReturnPolicy; // Return policy for the product
    private String productWarranty; // Warranty information for the product
    private String productReturnInstructions; // Instructions for returning the product
    private String productExchangePolicy; // Exchange policy for the product
    private String productExchangeInstructions; // Instructions for exchanging the product
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRestaurantBranchId() {
        return restaurantBranchId;
    }

    public void setRestaurantBranchId(String restaurantBranchId) {
        this.restaurantBranchId = restaurantBranchId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductSubCategory() {
        return productSubCategory;
    }

    public void setProductSubCategory(String productSubCategory) {
        this.productSubCategory = productSubCategory;
    }

    public String getProductTags() {
        return productTags;
    }

    public void setProductTags(String productTags) {
        this.productTags = productTags;
    }

    public String getProductAllergenInfo() {
        return productAllergenInfo;
    }

    public void setProductAllergenInfo(String productAllergenInfo) {
        this.productAllergenInfo = productAllergenInfo;
    }

    public String getProductNutritionalInfo() {
        return productNutritionalInfo;
    }

    public void setProductNutritionalInfo(String productNutritionalInfo) {
        this.productNutritionalInfo = productNutritionalInfo;
    }

    public String getProductPreparationTime() {
        return productPreparationTime;
    }

    public void setProductPreparationTime(String productPreparationTime) {
        this.productPreparationTime = productPreparationTime;
    }

    public String getProductServingSize() {
        return productServingSize;
    }

    public void setProductServingSize(String productServingSize) {
        this.productServingSize = productServingSize;
    }

    public String getProductDietaryInfo() {
        return productDietaryInfo;
    }

    public void setProductDietaryInfo(String productDietaryInfo) {
        this.productDietaryInfo = productDietaryInfo;
    }

    public String getProductIngredients() {
        return productIngredients;
    }

    public void setProductIngredients(String productIngredients) {
        this.productIngredients = productIngredients;
    }

    public String getProductStorageInstructions() {
        return productStorageInstructions;
    }

    public void setProductStorageInstructions(String productStorageInstructions) {
        this.productStorageInstructions = productStorageInstructions;
    }

    public String getProductCookingInstructions() {
        return productCookingInstructions;
    }

    public void setProductCookingInstructions(String productCookingInstructions) {
        this.productCookingInstructions = productCookingInstructions;
    }

    public String getProductServingSuggestions() {
        return productServingSuggestions;
    }

    public void setProductServingSuggestions(String productServingSuggestions) {
        this.productServingSuggestions = productServingSuggestions;
    }

    public String getProductPairingSuggestions() {
        return productPairingSuggestions;
    }

    public void setProductPairingSuggestions(String productPairingSuggestions) {
        this.productPairingSuggestions = productPairingSuggestions;
    }

    public String getProductPromotions() {
        return productPromotions;
    }

    public void setProductPromotions(String productPromotions) {
        this.productPromotions = productPromotions;
    }

    public String getProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(String productAvailability) {
        this.productAvailability = productAvailability;
    }

    public String getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(String productDiscount) {
        this.productDiscount = productDiscount;
    }

    public String getProductRating() {
        return productRating;
    }

    public void setProductRating(String productRating) {
        this.productRating = productRating;
    }

    public String getProductReviews() {
        return productReviews;
    }

    public void setProductReviews(String productReviews) {
        this.productReviews = productReviews;
    }

    public String getProductReturnPolicy() {
        return productReturnPolicy;
    }

    public void setProductReturnPolicy(String productReturnPolicy) {
        this.productReturnPolicy = productReturnPolicy;
    }

    public String getProductWarranty() {
        return productWarranty;
    }

    public void setProductWarranty(String productWarranty) {
        this.productWarranty = productWarranty;
    }

    public String getProductReturnInstructions() {
        return productReturnInstructions;
    }

    public void setProductReturnInstructions(String productReturnInstructions) {
        this.productReturnInstructions = productReturnInstructions;
    }

    public String getProductExchangePolicy() {
        return productExchangePolicy;
    }

    public void setProductExchangePolicy(String productExchangePolicy) {
        this.productExchangePolicy = productExchangePolicy;
    }

    public String getProductExchangeInstructions() {
        return productExchangeInstructions;
    }

    public void setProductExchangeInstructions(String productExchangeInstructions) {
        this.productExchangeInstructions = productExchangeInstructions;
    }
}
