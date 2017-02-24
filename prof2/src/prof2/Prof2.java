/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prof2;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Edgar1
 */
public class Prof2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanvasDib canvas = new CanvasDib();
        FrmGame fr = new FrmGame(canvas);
        fr.setSize(800, 600);
       
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
