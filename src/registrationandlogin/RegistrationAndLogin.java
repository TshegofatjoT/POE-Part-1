/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrationandlogin;
import java.util.Scanner;
/**
 *
 * @author tsheg
 */
public class RegistrationAndLogin {
    //This method was adapted from W3Schools
    //https://www.w3schools.com/java/
    //W3Schools

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        //The first process is creating an aoccount 
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String username= scan.next();
          
        
        System.out.println("Enter password: ");
        String password= scan.next();
        
        System.out.println("Enter first name: ");
        String firstname= scan.next();
        
        System.out.println("Enter last name: ");
        String lastname= scan.next();

        System.out.println("My Username is: " + username);
        System.out.println("My password is: " + password);
        System.out.println("My firstname is: " + firstname);
        System.out.println("My lastname is: " + lastname);

        //Username validation 
        if (username.length() < 5 & username.contains("_")){
                 System.out.println(" username Successfully captured");
   
    }
        else{
                 System.out.println("Username is not correctly formatted");

        }
        
        //Password validation 
        if (password.length() > 7 & password.matches(".*[A-Z].*[0-9].*[^a-zA-Z0-9].*")){
                 System.out.println("Password Successfully Captured");
   
    }
        else
                 System.out.println("Password is not correctly formatted");

        }
}
    
    
