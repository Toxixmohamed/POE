/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe1;

import javax.swing.JOptionPane;



/**
 *
 * @author toxix
 */
public class Part2Test {
public static void display(){
boolean quitFlag = false;
        boolean inputFlag = false;
        
        while (!quitFlag) {
            //menu
            int userInput = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                               
                                                                               Enter (1) To see Developers.
                                                                               Enter (2) To see Task Names.
                                                                               Enter (3) To see The TaskId's.
                                                                               Enter (4) To see Task Duration's.
                                                                               Enter (5) To see Task Status
                                                                               Enter (6) To exit  .""","Main Menu",JOptionPane.QUESTION_MESSAGE));
        
            //handle the choices
            switch (userInput) {
                case 1 -> {
                   developers(); inputFlag=true;
            } 
                case 2 -> taskNames();
                case 3 -> taskIDs();
                case 4 -> taskDuration ();
                case 5 -> taskStatus ();
                case 6 -> {
                    System.exit(0); quitFlag = true;
            }
            
                default -> JOptionPane.showMessageDialog(null, "Enter a valid number", "ERROR",JOptionPane.ERROR);
            }
        }
}

public static void developers(){
    
}
public static void taskNames (){
    
}
public static void taskIDs (){
    
}
public static void taskDuration (){
    
}
public static void taskStatus(){
    
}
   
}
