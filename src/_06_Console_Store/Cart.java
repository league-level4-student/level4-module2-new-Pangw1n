package _06_Console_Store;

import javax.swing.JOptionPane;

/*
 * The Cart class is a Bounded Type Generic class
 * 
 * <T extends Food> means we can only create a Cart with objects part of the 
 * Food class
 */

@SuppressWarnings("unchecked")
public class Cart<T extends Item> {
    private T[] cart;

    public Cart() {
        cart = (T[]) new Item[5];
    }

    // Adds an item to the cart
    public void add(T item) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = item;
                return;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Your cart is full!\nNo more than 5 items");
    }

    // Displays everything currently in the cart
    public void showCart() {
    	String output = "";
    	
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                output += (i != 0 ? ", " : "Cart: ") + cart[i].getItemName();
            }
        }
        
        System.out.println(output);
    }

    public int length() {
        return cart.length;
    }
}
