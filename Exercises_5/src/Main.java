import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // (Q1) Write a Java method to find the smallest number among three numbers.
        System.out.println("Input the first number: ");
        int num1 = input.nextInt();
        System.out.println("Input the Second number: ");
        int num2 = input.nextInt();ß
        System.out.println("Input the third number: ");
        int num3 = input.nextInt();

        System.out.println("The smallest value is: " + smallest(num1, num2, num3));
        // -----------------------------------------------------------------------------

        // (Q2) Write a Java method that check if the entered number is negative or positive or zero.
        System.out.println("Enter Number: ");
        int number = input.nextInt();
        System.out.println("The Number is:"+check(number));
        // -----------------------------------------------------------------------------

        // (Q3) Write a Java method to check whether a string is a valid password.
        /*
        Password rules:
        A password must have at least ten characters.
        password consists of only letters and digits. A
        password must contain at least two digits.
         */
        System.out.println(
                "Password rules:\n" +
                "-password must have at least ten characters.  \n" +
                "-password consists of only letters and digits.\n" +
                "-password must contain at least two digits.\n" +
                "---PLZ Enter Your Password---");
        String password = input.nextLine();
        if (checkPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }

    // ==> This Methods For (Q1)....
    public static int smallest(int num1, int num2, int num3) {
        Scanner input = new Scanner(System.in);
        int smaller = num1;
        if (num2 > num1) {
            smaller = num2;
        } else {
            smaller = num3;
        }
        return smaller;

    }
    // -----------------------------------------------------------------------------

    // ==> This Methods For (Q2)....
    public static int check(int num) {
        if (num > 0) {
            System.out.println("positive.");
        } else if (num < 0) {
            System.out.println("negative.");
        } else {
            System.out.println("zero.");
        }
        return num;

    }

    // -----------------------------------------------------------------------------
    // ==> This Methods For (Q3)....
    public static boolean checkPassword(String password) {
        if (password.length() < 8)
            return false;

        int digits = 0;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isDigit(ch))
                digits++;

            if (!Character.isLetterOrDigit(ch))
                return false;
        }

        return digits >= 2;
    }


}