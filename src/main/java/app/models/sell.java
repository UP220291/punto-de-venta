package main.java.app.models;
import java.time.LocalDateTime;
import java.util.List;

public class sell{

    private int id;
    private LocalDateTime dateTime;
    private double total;
    private List<wishlist> productSells;

    public sell() {}
    public sell(int id, LocalDateTime dateTime, double total, List<wishlist> productSells) {
        this.id = id;
        this.dateTime = dateTime;
        this.total = total;
        this.productSells = productSells;
    }
    // Getters
    public int getId() {
        return id;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public double getTotal() {
        return total;
    }
    public List<wishlist> getProductSells() {
        return productSells;
    }
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public void setProductSells(List<wishlist> productSells) {
        this.productSells = productSells;
    }
}

