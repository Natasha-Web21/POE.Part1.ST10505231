import java.util.Scanner;
public class MainClass {

    public static void main(String[] args) {
        LoginClass login = new LoginClass();
        //Register user
        login.registerUser();
        //Login user
        boolean isLoggedIn = login.loginUser();
        //Display login result
        System.out.println(login.returnLoginStatus(isLoggedIn));

    }
}



