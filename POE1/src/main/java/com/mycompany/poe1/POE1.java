/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poe1;





import java.util.Scanner;





/**
 *
 * @author toxix
 */
public class POE1 {

    public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
    System.out.println("Welcome to the menu, Please Sign up then Login");
    System.out.println("Please enter you Name and Surname");
    String name = kb.nextLine();
    registerUser();
    Part2 a = new Part2();
    System.out.println(Part2.loginUser(name, name, name));
    Part3 b = new Part3();
    System.out.println(Part3.easyKanban());
    
    
    }
    
     public static void registerUser(){
     Scanner kb = new Scanner(System.in);
     System.out.println("Please enter a Username that contains an underscore and is less than 5 characters ");
     String username = kb.nextLine();
     System.out.println(checkusername(username,"_",true,false));
    
     System.out.println("Please enter a Password that contains a number, contains a special character, contains a capital letter and is 8 characters or more");
     String password = kb.nextLine();
     System.out.println(checkPasswordComplexity(password));
     }
   
    public static boolean checkusername(String username,String word,boolean present,boolean caseSensitive) {
   
       if(!caseSensitive){
     username = username.toUpperCase();
     word = word.toUpperCase();
       if (username.length()<=5) 
       if (present){
       }
       else{
        System.out.println("Username not correctly formatted, Please ensure that your username contains an underscore and is less than 5 characters long");
         return !username.contains(word); } 
       } 
        
        return true;}
       
      
     
     public static boolean checkPasswordComplexity(String password){
    String specialChars = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
    String numbers ="1234567890";
    String capital ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    boolean check = false;
    boolean length = false;
		
   
    for (int i = 0; i <= password.length(); i++) {
   String strChar = Character.toString(password.charAt(i));
    if (password.length()>=8){
    System.out.println("Password correctly formatted.......You have been registered sucessfully");
    return true;
    }else{
    System.out.println(" Password not correctly formatted, Please ensure that your password contains a number, contains a special character, contains a capital letter and is 8 characters or more");
    }
   if (specialChars.contains(strChar) && numbers.contains(strChar) && capital.contains(strChar)) {
    check = false;
    break;
			}
                 } return true; }
} 


    


  // Refrences      
  //https://youtu.be/MGJkDAtQSws
  //https://www.javaguides.net/2020/03/java-scanner-tutorial-reading-login-and-registration-user-input.html?msclkid=d83db0b0d13511eca5f328f6877e20c6
  //https://codingface.com/how-to-check-string-contains-special-characters-in-java/?msclkid=50449413d09b11ec9549c5a22e61ce73

 