package _06_Console_Store;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Item {
    String image;

    int price;
    
    public abstract String getItemName();

    public abstract JLabel getItemImage();
    
    @SuppressWarnings("rawtypes")
    public static ImageIcon loadImage(String fileName) {
        try {
            return new ImageIcon(ImageIO
                    .read(new Cart().getClass().getResourceAsStream(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int getPrice()
    {
    	return price;
    }
}
