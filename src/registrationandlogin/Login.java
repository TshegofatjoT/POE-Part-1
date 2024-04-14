/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationandlogin;

/**
 *
 * @author tsheg
 */

public class Login {
        private String username;
        private String password;

    // Constructor to initialize username and password
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method to check if username contains an underscore
    public boolean checkUserName() {
        return username.contains("_")&&
               username.length() < 5;
    }

    // Method to check password complexity
    public boolean checkPasswordComplexity() {
        // Password must be at least 8 characters long,
        // contain at least one uppercase letter, one digit, and one special character
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9]*") &&
               password.matches(".*[^a-zA-Z0-9].*");
    }

    // Method to register a user
    public String registerUser() {
        // Check username format and password complexity
        if (!checkUserName()) {
            return "Username is incorrectly formatted.";
        } else if (!checkPasswordComplexity()) {
            return "Password does not meet complexity requirements.";
        } else {
            return "User registered successfully.";
        }
    }

    // Method to login a user
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        // Check if entered username and password match stored credentials
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }

    // Method to return login status message
    public String returnLoginStatus(boolean loginStatus) {
        return loginStatus ? "Login successful." : "Login failed.";
    }
    //Conditions to whether the user entered the correct Username and Password 
    public String login(String userFirstName, String userLastName, boolean loginSuccessful) {
    if (loginSuccessful) {
        return "Welcome: " + userFirstName + " " + userLastName + ", it is great to see you again.";
    } else {
        return "Username or password incorrect, please try again.";
    }
}


}



    
    

