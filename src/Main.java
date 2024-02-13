import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter a last name: ");
        String lastName = scanner.nextLine();
        Email userAccount = new Email(firstName, lastName);

        String x = userAccount.getEmail();
        String y = userAccount.getPassword();

        System.out.println("\n--------------------------------------------\n");
        System.out.println("Please Enter Creditionals to Login:\n");


        boolean exit = true;
        do{
                System.out.println("Email: ");
                String emailEntry = scanner.nextLine();
                System.out.println("Password: ");
                String passwordEntry = scanner.nextLine();
                if(emailEntry.equals(userAccount.getEmail()) && passwordEntry.equals(userAccount.getPassword()))
                {
                    System.out.println("Login Succesful!");
                    exit = false;

                } else {
                    System.out.println("Login Invalid.\n");


                }
        }while(exit);




    }
}