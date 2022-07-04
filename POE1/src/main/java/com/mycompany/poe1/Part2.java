/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;


import java.util.Scanner;


/**
 *
 * @author toxix
 */
class Part2 {
   
    public static boolean loginUser(String username,String password,String name){         
     Scanner kb = new Scanner(System.in);
     System.out.println("Since u have signed up.....Please login ");
     
     System.out.println("Please enter your username");
     
     username=kb.nextLine();
     System.out.println("Please enter your password");
     password=kb.nextLine();
   
     if(!checkusername().equals(username) && !checkPasswordComplexity().equals(password)) {
                System.out.println("A successful Login" + " " + name);
                 return true;
            } else 
            {
                System.out.println("A unsucessful Login");
                return false;
            }
          }
      private static Object checkusername() {
       return true ; 
    }

    private static Object checkPasswordComplexity() {
        return true ; 
    }
   
    
}

  
