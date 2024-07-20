package _06_Console_Store;

import java.util.Scanner;

public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */
	
	int balance;
	Cart cart;
	Scanner scanner;

    public static void main(String[] args) {
    	new ConsoleStore().shopping();
    }
    
    public void shopping()
    {
    	boolean checkout = false;
    	balance = 60;
    	cart = new Cart<Item>();
    	scanner = new Scanner(System.in);
    	
    	do 
    	{
        	System.out.println("Commands: add item, remove item, view cart, check out");
    		String input = scanner.nextLine();
    		
        	if (input.equals("add item"))
        	{
        		addItem();
        	}
        	else if (input.equals("remove item"))
        	{
        		removeItem();
        	}
        	else if (input.equals("view cart"))
        	{
        		cart.showCart();
        		System.out.println("Total price" + cart.getTotal());
        	}
        	else if (input.equals("check out"))
        	{
            	checkout = true;
        	}
    	}
    	while (checkout == false);
    }
    
    

	void addItem()
    {
    	System.out.println("Shelf: tshirt - $15, hoodie - $20, pants - $15, shorts - $10");
    	System.out.println("Add an item: ");
    	
    	String input = scanner.nextLine();
    	
    	if (input.equals("tshirt"))
    	{
    		cart.add(new Tshirt());
    	}
    	else if (input.equals("hoodie"))
    	{
    		cart.add(new Hoodie());
    	}
    	else if (input.equals("pants"))
    	{
    		cart.add(new Pants());
    	}
    	else if (input.equals("shorts"))
    	{
    		cart.add(new Shorts());
    	}
    	return;
    }
    
    void removeItem() {
    	cart.showCart();
		System.out.println("Remove an item: ");
		
		int input = scanner.nextInt();
		
		cart.remove(input);
		
		return;
	}
}
