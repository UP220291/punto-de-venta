package main.java.app.models;

public class wishlist {
    private Product product;
    private int quantity;

    public wishlist() {}
    public wishlist(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    // Getters
    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    // Setters
    public void setProduct(Product product) {
        this.product = product;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
