/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prof2;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author servkey
 */
public class CanvasDib extends Canvas{
    
    private int x = 10;
    private int y = 10;
    private BufferedImage sample;
    private BufferedImage sample2;
    
    private BufferedImage cargarImagen(String file){
        BufferedImage img = null;
        try{
            URL image = getClass().getResource(file);
            img = ImageIO.read(image);
        }catch(Exception e){
        }
         return img;
    }
    
    @Override
    public void paint(Graphics g)
    {    if (sample == null) sample = cargarImagen("./folder/bg.png");
         g.drawImage(sample, 0, 0, this);
         if (sample2 == null) sample2 = cargarImagen("./folder/linux.png");
         g.drawImage(sample2, getX(), 410, this);
       //  g.setColor(Color.BLUE);     //Activa el color azul
        /// g.fillOval(getX(), getY(), 60, 60); //Dibuja un óvalo
        
         

    }   

    @Override
    public void update(Graphics g)
    {
        super.update(g);
        paint(g);
        x+=1;
    }
    
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
        
}
