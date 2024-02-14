import java.util.Scanner;
import java.util.Random;

class Email {
    Random random = new Random();

    private String email;
    private String password = "";
    final private String[] CHARS = {"1","2","3","4","5","6","7","8","9","0","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};



    Email(String firstName, String lastName){

        email = setEmail(firstName, lastName);
        System.out.println("Your email address is: " + getEmail());
        password = setPassword();
        System.out.println("Your password is: " + getPassword());
    }

    private String setEmail(String firstName, String lastName){
        return (firstName + "." + lastName + "@department.company.com").toLowerCase();
    }
    public String getEmail()
    {
        return email;
    }

    private String setPassword(){
        int index;
        int length = 0;
        do{
            index = random.nextInt(36);
            password += CHARS[index];
            length++;

        }while(length != 10);

        return password;
    }

    public String getPassword(){
        return password;
    }

}
