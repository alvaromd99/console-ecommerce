/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author alvaro
 */
public class Product {

    private int productId;
    private String name;
    private double price;
    private Category category;

    public Product(int productId, String name, double price, Category category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("productId = ").append(productId);
        sb.append(", name = ").append(name);
        sb.append(", price = ").append(price).append(" €");
        sb.append(", category = ").append(category);
        sb.append('}');
        return sb.toString();
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
