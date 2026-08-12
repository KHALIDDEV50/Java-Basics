import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*1.Write a program that prints the numbers from 1 to 100 such that:
         If the number is a multiple of 3, you need to print "Fizz" instead of that number.*/
        /*If the number is a multiple of 5, you need to print "Buzz" instead of that number.
            If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"instead of that number.
            * */
        // Answre Q1:
        System.out.println("Enter startRange: ");
        int startRange = input.nextInt();
        System.out.println("Enter endtRange: ");
        int endtRange = input.nextInt();

        for (startRange = 1; startRange <= endtRange; startRange++) {

            if (startRange % 3 == 0 && startRange % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (startRange % 3 == 0) {

                System.out.println("Fizz");
            } else if (startRange % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(startRange);
            }
        }

        /* 2.Write a Java program to reverse a string.
             Test Data: Input a string:
             The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT */
        System.out.println("Enter Test Data: ");
        String data = input.nextLine();

        for (int i = data.length() - 1; i >= 0; i--) {

            System.out.print(data.charAt(i));

        }

        /*3.Write a program to find the factorial value of any number entered through the keyboard.*/

        System.out.println("Enter The Any Number: ");
        int number = input.nextInt();

        int factorial = 1;
        for (int i = 1; i <= number; i++) {

            factorial *= i;
        }

        System.out.println("The factorial for" + number + "==>" + factorial);


        /* 4.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built in method)*/
        System.out.println("Enter Tow Numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = 1;
        for (int i = 1; i <= num2; i++) {

            result = result * num1;
        }
        System.out.println(num1 + " ^ " + num2 + " = " + result);

        /*5.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.*/
        System.out.println("Enter the Start range number: ");
        int sRange = input.nextInt();

        System.out.println("Enter the End range number: ");
        int eRange = input.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = sRange; i <= eRange; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);


        /*6.Write a program that prompts the user to input a positive integer.
         It should then output a message indicating whether the number is a prime number.*/
        System.out.println("Enter a number:");
        int number1 = input.nextInt();

        int count = 0;

        for (int i = 1; i <= number1; i++) {
            if (number1 % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");


        /*7.Use a for loop to print headings for four weeks (Weeks 1 - 4).
         then use another for loop to print the days (Days 1-7) for each week.Expected Output:*/
            System.out.println("Enter number of weeks: ");
            int weeks = input.nextInt();
            for (int i = 1; i <= weeks; i++) {
                System.out.println("Week " + i);
                for (int j = 1; j <= 7; j++) {
                    System.out.println("day " + j);
                }
            }

        /*8.Write a program thats check if the word is a palindrome(كلمة متشابهة من اليمين او الشمال مثل madam) or not. hint:
         A string is said to be a palindrome if it is the same if we start reading it from
         left to right or right to left.*/
            System.out.println("Enter a word: ");
            String word = input.nextLine();
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {

                System.out.print(word.charAt(i));
                reverse = reverse + word.charAt(i);
            }
            if (word.equals(reverse)) {
                System.out.println(" ==> Palindrome");
            } else {
                System.out.println(" ==> Not Palindrome");
            }


        }


    }
}




