import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        int alter;
        Scanner scanName = new Scanner(System.in);
        Scanner scanalter = new Scanner(System.in);


        System.out.println("Hello. this Guide will determine wether you are allowed to paticipate in the election or not.");

        System.out.println("Please enter your name first.");
        name = scanName.next();

        System.out.println("Now write down your age.");
        alter = scanalter.nextInt();
        
        if (alter >= 16)
        {
            System.out.println("Welcome " + name +". " + "You can participate in the election");
        } else
        {
            System.out.println("Sorry you are not allowed to participate.");
        }



    }
}