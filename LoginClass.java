import java.util.Scanner;
public class LoginClass {

    private String username;
    private String password;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    Scanner input = new Scanner(System.in);

    //Check username
    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    //Check password complexity
    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[!@#$%^&*()].*");

    }
        //Check SA phone number (+27...)
    public boolean checkCellPhoneNumber(String number) {
        return number.matches("^\\+27\\d{9}$");
    }

    //Registration (registering the user)
    public String registerUser() {
        System.out.print("Enter first name: ");
        firstName = input.nextLine();
        System.out.print("Enter last name: ");
        lastName = input.nextLine();
        System.out.print("Enter username: ");
        username = input.nextLine();
        if (checkUsername(username)) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length");
        return "Registration failed";
        }

        //Password
        System.out.print("Enter password: ");
        password = input.nextLine();
        if (checkPasswordComplexity(password)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        return "Registration failed";
        }
            //Phone number
            System.out.print("Enter cell phone number: ");
            phoneNumber = input.nextLine();
            if (checkCellPhoneNumber(phoneNumber)) {
                System.out.println("Cell phone number successfully added.");
            } else {
                System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
                return "Registration failed";
            }
            return "Registration complete";
        }

        //Login user
        public boolean loginUser() {
            System.out.print("Enter username: ");
            String enteredUsername = input.nextLine();
            System.out.print("Enter password: ");
            String enteredPassword = input.nextLine();
            return enteredUsername.equals(username) && enteredPassword.equals(password);
        }

        //Return login message
        public String returnLoginStatus(boolean success) {
        if (success) {
                return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
            } else {
                return "Username or password incorrect, please try again.";

            }
        }
    }

