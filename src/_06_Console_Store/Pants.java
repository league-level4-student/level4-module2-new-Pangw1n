package _06_Console_Store;

import javax.swing.JLabel;

public class Pants extends Item {

	public Pants()
	{
		price = 15;
		this.image = "pants.jpeg";
	}
	
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return "pants";
	}

	@Override
	public JLabel getItemImage() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.image));
	}

}
