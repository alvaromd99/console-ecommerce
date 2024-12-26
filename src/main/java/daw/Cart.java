/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author alvaro
 */
public class Cart {

    private int userId;
    private final ListOfOrderItems cartList;

    public Cart(int userId) {
        this.userId = userId;
        this.cartList = new ListOfOrderItems();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ListOfOrderItems getCartList() {
        return cartList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cart{");
        sb.append("userId=").append(userId);
        sb.append(", cartList=").append(cartList);
        sb.append('}');
        return sb.toString();
    }
}
