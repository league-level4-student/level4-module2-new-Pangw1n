package _06_Console_Store;

import javax.swing.JLabel;

public class Hoodie extends Item {

	public Hoodie()
	{
		price = 20;
		this.image = "hoodie.jpeg";
	}
	
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return "hoodie";
	}
	
	@Override
	public JLabel getItemImage() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.image));
	}
}
