import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter a last name: ");
        String lastName = scanner.nextLine();
        scanner.close();
        Email userEmail = new Email(firstName, lastName);


    }
}