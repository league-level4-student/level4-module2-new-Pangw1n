package _06_Console_Store;

import javax.swing.JLabel;

public class Tshirt extends Item {
	
	public Tshirt()
	{
		price = 15;
		this.image = "Tshirt.jpg";
	}
	
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return "tshirt";
	}
	
	@Override
	public JLabel getItemImage() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.image));
	}
}
