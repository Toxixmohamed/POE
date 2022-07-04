/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author toxix
 */
public class Part3 {
 private static final  String [] taskName = new String[3];
    private static final  int [] taskNumber = new int [3];
    private static final  String [] taskDescription = new String[3];
    private static final  String [] developerDetails = new String[3];
    private static final  int [] taskDuration= new int[3];
    private static final  int [] taskID = new int[3];
    private static final  String [] taskStatus = new String[3];
    
   
    public static String[] getTaskStatus() {
        return taskStatus;
    }
    
   
    
    
    
    static Object easyKanban() {
    JOptionPane.showMessageDialog(null,"Welcome to EasyKanban");


       
        
        boolean quitFlag = false;
        boolean inputFlag = false;
        
        while (!quitFlag) {
            
            int userInput = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                               Enter (1) To add tasks.
                                                                               Enter (2) This feature is still in development.
                                                                               Enter (3) To exit.
                                                                               Enter (4) To display all the task details  .""","Main Menu",JOptionPane.QUESTION_MESSAGE));
        
            
            switch (userInput) {
                case 1 -> {
                    loadArray();inputFlag=true;
            } 
                case 2 -> searchArray();
                case 4 -> {
                    if(inputFlag){
                        displayAll();
                    }else{
                        JOptionPane.showMessageDialog(null, "Please enter the items first!");
                    }
            }
                case 3 -> {
                    System.exit(0); quitFlag = true;
            }
            
                default -> JOptionPane.showMessageDialog(null, "Enter a valid number", "ERROR",JOptionPane.ERROR);
            }
        }
        return null;
    }

    private static void loadArray() {
       
        for (int i = 0; i < taskNumber.length; i++) {
            taskName[i] = JOptionPane.showInputDialog("Please enter the name of the task to be performed ");
            taskDescription[i] = JOptionPane.showInputDialog("Short description of task which should not exceed 50 characters in lenght ");
            checkTaskDescription();
            developerDetails[i] = JOptionPane.showInputDialog("Please enter the name and surname of the person assigned to this task");
            taskDuration[i] = (int) Double.parseDouble(JOptionPane.showInputDialog("Please enter the estimated duration of task in hours"));
             boolean quitFlag = false;
             boolean inputFlag = false;
            int userInput = Integer.parseInt (JOptionPane.showInputDialog(null,"""
                                                                               Enter (1) To Do.
                                                                               Enter (2) Done.
                                                                               Enter (3) Doing
                                                                               Enter (4) To exit .""","Main Menu",JOptionPane.QUESTION_MESSAGE));
            
        
            
            switch (userInput) {
                case 1 ->  taskStatus[i]="To Do";
                case 2 ->  taskStatus[i]= "Done";
                case 3 ->  taskStatus[i]= "Doing";        
                case 4 ->  { System.exit(0); quitFlag = true;}      
                default -> JOptionPane.showMessageDialog(null, "Enter a valid number", "ERROR",JOptionPane.ERROR);    
            
            }
             }
    } 

    public static String[] getTaskName() {
        return taskName;
    }

    public static int[] getTaskNumber() {
        return taskNumber;
    }

    public static String[] getTaskDescription() {
        return taskDescription;
    }

    public static String[] getDeveloperDetails() {
        return developerDetails;
    }

    public static int[] getTaskDuration() {
        return taskDuration;
    }

    public static int[] getTaskID() {
        return taskID;
    }
    private static boolean checkTaskDescription(){
    if (taskDescription.length >=50){
    JOptionPane.showMessageDialog(null,"Task Description sucessfully captured");
    return true; }
    else {
    JOptionPane.showMessageDialog(null,"Task Description should not exceed 50 characters in lenght");    
    }
        return false;
         }
  
    public static void createTaskID(){
      for (int i = 0; i < taskName[0].length(); i++);
        String substring = taskName[0].substring(0,2);
        String substrings = developerDetails[0].substring(0,-3);
        JOptionPane.showMessageDialog(null,substring + ':' + Arrays.toString(taskNumber) +':'+ substrings );
        
        
    }
    
     private static void searchArray() {
    JOptionPane.showMessageDialog(null,"COMING SOON ");
    }

    private static void displayAll() {
        
        JOptionPane.showMessageDialog(null, """
                                            
                                            Device Count:  TASK          NUMBER            DESCRIPTION       DETAILS         ID         DURATION         STATUS
                                            --------------------------------------------------
                                            """
                + taskName[0] + "  \t " + taskNumber[0]+ " \t  " +   taskDescription[0]+ " \t  " +developerDetails[0] +" \t " + taskID [0]+ "\t"+ taskDuration[0] + taskStatus[0]
                + taskName[1] + "  \n " + taskNumber[1]+ " \t  " +   taskDescription[1]+ " \t  " +developerDetails[1] +" \t " + taskID [1]+ "\t"+ taskDuration[1] + taskStatus[1]
                + taskName[2] + "  \n " + taskNumber[2]+ " \t  " +   taskDescription[2]+ " \t  " +developerDetails[2] +" \t " + taskID [2]+ "\t"+ taskDuration[2] + taskStatus[2]);
    }
 static boolean  display(){
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
        return true;
      
      
}

public static void developers(){
JOptionPane.showMessageDialog(null,developerDetails);
}
public static void taskNames (){
    JOptionPane.showMessageDialog(null,taskName);    
}
public static void taskIDs (){
JOptionPane.showMessageDialog(null,taskID);    
}
public static void taskDuration (){
JOptionPane.showMessageDialog(null,taskDuration);    

}

public static void taskStatus(){
JOptionPane.showMessageDialog(null,taskStatus);    
}
}


























































