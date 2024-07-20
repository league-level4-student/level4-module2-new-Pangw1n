package _06_Console_Store;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
    
    public void remove(int index) {
    	cart[index] = null;
        for (int i = 0; i < cart.length; i++) {
        	for (int j = 0; j < cart.length - 1; j++)
        	{
        		if (cart[j] == null) {
        			cart[j] = cart[j + 1];
        			cart[j + 1] = null;
        		}
            }
        }
    }

    // Displays everything currently in the cart
    public void showCart() {
    	String output = "";
    	
    	if (cart.length == 0)
    	{
    		output = "cart is empty";
    	}
    	else
    	{
	        for (int i = 0; i < cart.length; i++) {
	            if (cart[i] != null) {
	                output += (i != 0 ? ", " : "Cart: ") + i + " - " + cart[i].getItemName();
	            }
	        }
    	}
        
        System.out.println(output);
    }
    
    public void displayItems()
    {
    	JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                panel.add(cart[i].getItemImage());
            }
        }
        frame.pack();
    }

    public int length() {
        return cart.length;
    }

	public int getTotal() {
		int total = 0;
		for (int i = 0; i < cart.length; i++)
		{
			total += cart[i].getPrice();
		}
		return total;
	}
}
