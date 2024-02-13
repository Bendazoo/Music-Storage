import java.util.Scanner;
import java.util.Random;

public class Email {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public void setEmail(){
        System.out.println("Please enter a firstname: ");
        firstName = scanner.nextLine();
        System.out.println("Please enter a lastname: ");
        lastName = scanner.nextLine();
        email = (firstName + "." + lastName + "@department.company.com").toLowerCase();
    }
    public String getEmail(){
        return "Your assigned email is: " + email;
    }


    public void setPassword(){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        while()

    }


}
