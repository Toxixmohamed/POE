
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toxix
 */
public class LoginMenu {
 public LoginMenu() {
    }
    static Register register = new Register();

    public static void main(String[] args) {

        try (Scanner kb = new Scanner(System.in)) {
            System.out.print(" Enter firstname => ");
            String firstname = kb.nextLine();
            register.setFirstName(firstname);

            System.out.print(" Enter lastname => ");
            String lastname = kb.nextLine();
            register.setLastName(lastname);

            System.out.print(" Enter userName => ");
            String username = kb.nextLine();
            register.setUserName(username);

            System.out.print(" Enter password => ");
            String password = kb.nextLine();
            register.setPassword(password);

           System.out.println(register.toString());
        }       
        
        }
}


class Register {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    
    public String getFirstName() {
        return firstname;
    }
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
    public String getUserName() {
        return username;
    }
    public void setUserName(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
   
    
    @Override
    public String toString() {
        return "Register [firstName=" + firstname + ", lastName=" + lastname + ", userName=" + username + ", password=" +
            password + "]";   
}
}   
    

