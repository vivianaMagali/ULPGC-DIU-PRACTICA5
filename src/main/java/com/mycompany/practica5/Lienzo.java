package com.mycompany.practica5;

import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;

public class Lienzo extends JPanel {
    private static BufferedImage image;
    private static BufferedImage auxImage;
    
    
    public Lienzo()  {
        try {
            image = ImageIO.read(new URL("https://http2.mlstatic.com/super-mario-bross-figuras-de-mario-bros-luigi-y-yoshi-D_NQ_NP_870943-MPE32061469110_092019-F.jpg"));
            this.setPreferredSize(new Dimension(image.getWidth(),image.getHeight()));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(auxImage, 0, 0, null);
    }
    
    public static BufferedImage getImage() {
        return image;
    }
   
    public void setImage(BufferedImage image) {
        auxImage = image;
    }
    
    
}
