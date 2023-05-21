/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game;

/**
 *
 * @author dksdk
 */
import javax.swing.JFrame;

public class Game {

    public static void main(String[] args) {
       JFrame obj = new JFrame(); //Frame
        GamePlay gameplay = new GamePlay();
        obj.setBounds(10,10,700,600); //Pannel
        obj.setTitle("BrickBreaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay); //frame.add(pannel)
    }
}
