import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ==> Answer (Q1)
        /*
        System.out.println("Enter role:\n");
        String role = input.nextLine().toLowerCase();

        if (role.equals("admin")){
            System.out.println("welcome admin");
        } else if (role.equals("superuser")) {
            System.out.println("welcome superuser");
        }
        else if  (role.equals("user")) {
            System.out.println("welcome user");
        }
        */
        // ==> Answer (Q2)
        /*
        System.out.println("Plz Enter Three Number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("The greatest number is: " + num3);
        }
         */
       // ==> Answer (Q3)
        /*
        System.out.println("Enter Number form 1 To 7");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number");
        }
         */

        // ==> Answer (Q4)
        /*
        System.out.println("Enter your numeric score: ");
        int score = input.nextInt();

        if (score >= 90  && score <= 100){
            System.out.println("Numeric Score:" + score);
            System.out.println("Letter Grade: A" );
        } else if (score >=80 && score <= 89) {
            System.out.println("Numeric Score:" + score);
            System.out.println("Letter Grade: B" );

        } else if (score >= 70 && score <= 79) {
            System.out.println("Numeric Score:" + score);
            System.out.println("Letter Grade: C" );
        } else if (score >= 60 && score <= 69) {
            System.out.println("Numeric Score:" + score);
            System.out.println("Letter Grade: D" );

        } else if (score >= 0 && score <= 59) {
            System.out.println("Numeric Score:" + score);
            System.out.println("Letter Grade: F" );
        }
        else {
            System.out.println("Invalid input.. ");
        }

         */
        // ==> Answer (Q5)

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age < 13 ){
            System.out.println("You are an Child.");
        } else if (age >=13 && age <= 19) {
            System.out.println("You are an Teenager.");

        } else if (age >= 20) {
            System.out.println("You are an Adult.");

        }


    }
}