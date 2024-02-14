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

        int userOption;
        do{
            exit = true;
            System.out.println("Enter the option you would like. ");
            System.out.println("Add music to library: 1");
            System.out.println("                 Rap: 2");
            System.out.println("                 R&B: 3");
            System.out.println("                Exit: 4");
            userOption = scanner.nextInt();

            if(userOption == 1){
                System.out.println("Which branch would you to access.");
                System.out.println("                 Rap: 1");
                System.out.println("                 R&B: 2");
                System.out.println("                Back: 3");
                userOption = scanner.nextInt();
                if(userOption ==1){
                    System.out.println("Welcome to rap");
                } else if(userOption ==2){
                    System.out.println("Welcome to R&b");
                }else if(userOption ==3){
                    continue;
                }


            }else if(userOption == 2){

            }else if(userOption == 3){

            } else if(userOption ==4){
                exit = false;
                System.out.println("Thank you for using my app.");
            }

        }while(exit);


       ;






    }
}