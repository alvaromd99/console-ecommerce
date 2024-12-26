/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class ListOfOrderItems {
    // Internal list to store the items
    private final ArrayList<OrderItem> list;

    /**
     * Default constructor to initialize the list of items.
     */
    public ListOfOrderItems() {
        this.list = new ArrayList<>();
    }

    /**
     * Adds a new item to the list. If the item already exists, its quantity is
     * updated.
     *
     * @param product The product to be added.
     * @param quantity The quantity of the product to add.
     * @return true if the item was added or updated successfully, false
     * otherwise.
     */
    public boolean addItem(Product product, int quantity) {
        // Add or update the item
        return false;
    }

    /**
     * Removes an item from the list based on the product.
     *
     * @param product The product to remove.
     * @return true if the item was successfully removed, false if the item was
     * not found.
     */
    public boolean removeItem(Product product) {
        // Remove the item
        return false;
    }

    /**
     * Modifies the quantity of an existing item in the list. If the new
     * quantity is zero, the item is removed from the list.
     *
     * @param product The product whose quantity needs to be updated.
     * @param newQuantity The new quantity for the product. If zero, the item
     * will be removed.
     * @return true if the quantity was updated or the item was removed
     * successfully, false otherwise.
     */
    public boolean modifyQuantity(Product product, int newQuantity) {
        // Modify the item's quantity
        return false;
    }

    /**
     * Retrieves the list of items.
     *
     * @return The current list of items.
     */
    public ArrayList<OrderItem> getItems() {
        // Return the list of items
        return null;
    }

    /**
     * Calculates the total price of all items in the list.
     *
     * @return The total price of all items.
     */
    public double calculateTotalAmount() {
        // Calculate the total price
        return 0.0;
    }

    /**
     * Clears all items from the list.
     *
     * @return true if the list was successfully cleared, false if it was
     * already empty.
     */
    public boolean clear() {
        // Clear the list
        return false;
    }
}
