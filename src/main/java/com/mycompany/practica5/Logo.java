package com.mycompany.practica5;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Logo extends JPanel{
    
    private BufferedImage image;
    
    public Logo(){
        try {
            image = ImageIO.read(new URL("https://res-4.cloudinary.com/crunchbase-production/image/upload/c_lpad,h_256,w_256,f_auto,q_auto:eco/joewvo5qbfrcn0mbyaqi"));
            this.setPreferredSize(new Dimension(image.getWidth(),image.getHeight()));
        } catch (IOException ex) {
            Logger.getLogger(Logo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image,0, 0, null);
    }
    
    public BufferedImage getLogo() {
        return image;
    }
    
    public void moveImageRightUpper() {
        this.setLocation(560, 0);
    }
    
    public void moveImageLeftUpper() {
        this.setLocation(0, 0);
    }
    
    public void moveImageRightLower() {
        this.setLocation(560, 420);
    }
    
    public void moveImageLeftLower() {
        this.setLocation(0, 420);
    }
}
