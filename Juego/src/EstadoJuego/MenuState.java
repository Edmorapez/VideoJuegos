/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoJuego;

import TileMap.Background;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

/**
 *
 * @author Edgar1
 */
public class MenuState extends GameState{
    
    private Background bg;
    private int currentChoice = 0;
    private String []options ={"Inicio","Ayuda","Salir"};
    
    private Color tittleColor;
    private Font tittleFont;
    
    private Font font;
    
    
    public MenuState(ManejadorEstadoJuego gsm){
        this.gsm = gsm;
        try{///menuuuuuuuuuuuuuuuu
            bg = new Background("/resources/Backgrounds/fondoNoche.gif",1);///Resources/Backgrounds/fondoNoche.gif"
            bg.setVector(-0.1, 0);
            tittleColor = new Color(255,255,255);
            tittleFont = new Font("Super Plumber Brothers",Font.PLAIN,38);
            font = new Font("Pixel Emulator",Font.PLAIN,12);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void init() {
        throw new UnsupportedOperationException("Not supported ddddddddddyet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        bg.update();
    }

    @Override
    public void draw(Graphics2D g) {
        //dibujar el background
        bg.draw(g);
        
        //dibujar el tittle
        
        g.setColor(tittleColor);
        g.setFont(tittleFont);
        g.drawString("chicken ninja",80,70);
        
        //dibujar las opciones del menu
        
        g.setFont(font);
        for(int i =0;i<options.length;i++){
            
            if(i==currentChoice){
                g.setColor(Color.RED);
                
            }else{
                g.setColor(Color.getHSBColor(255, 164, 32));
            }
            g.drawString(options[i], 135, 140 + i * 15);
        }
    }

    private void select() {
        if(currentChoice == 0){
            //start
            gsm.setState(ManejadorEstadoJuego.LEVEL1STATE);
            
        }
        if(currentChoice == 1){
            //help
        }
        if(currentChoice == 2){
            System.exit(0);
        }
    }
    @Override
    public void keyPressed(int k) {
        if(k==KeyEvent.VK_ENTER){
            select();
        }
         if(k==KeyEvent.VK_UP){
             currentChoice--;
             if(currentChoice == -1){
                 currentChoice = options.length - 1;
             }
         }
          if(k==KeyEvent.VK_DOWN){
             currentChoice++;
             if(currentChoice == options.length){
                 currentChoice = 0;
             }
         }


    }

    @Override
    public void keyReleased(int k) {
      
    }

    
    
}
