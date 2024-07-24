package _06_Console_Store;

import javax.swing.JLabel;

public class Shorts extends Item {

	public Shorts()
	{
		price = 10;
		this.image = "Shorts.jpeg";
	}
	
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return "shorts";
	}
	
	@Override
	public JLabel getItemImage() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.image));
	}
}
