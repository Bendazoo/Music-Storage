import java.util.Scanner;
import java.util.Random;

class Email {
    Random random = new Random();
    private String firstName;
    private String lastName;
    private String email;
    private String password = "";
    final private String[] chars = {"1","2","3","4","5","6","7","8","9","0","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};



    Email(String firstName, String lastName){

        email = setEmail(firstName, lastName);
        System.out.println(getEmail());
        password = setPassword();
        System.out.println(getPassword());
    }

    private String setEmail(String firstName, String lastName){
        return (firstName + "." + lastName + "@department.company.com").toLowerCase();
    }
    private String getEmail()
    {
        return "Your assigned email is: " + email;
    }

    private String setPassword(){
        int index;
        int length = 0;
        do{
            index = random.nextInt(36);
            password += chars[index];
            length++;

        }while(length != 10);

        return password;
    }

    private String getPassword(){
        return "Your password is: " + password;
    }

}
