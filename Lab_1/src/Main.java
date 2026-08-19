import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //  (Q1) 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers ,
        //  takes two numbers as input
        try {
            System.out.println("Enter First Number: ");
            int num1 = input.nextInt();
            System.out.println("Enter Secound Number: ");
            int num2 = input.nextInt();
            //int sum;
            System.out.println(num1 + "+" + num2 + "= " + (num1 + num2));
            System.out.println(num1 + "-" + num2 + "= " + (num1 - num2));
            System.out.println(num1 + "/" + num2 + "= " + (num1 / num2));
            System.out.println(num1 + "*" + num2 + "= " + (num1 * num2));
            System.out.println(num1 + "%" + num2 + "= " + (num1 % num2));
        }
        catch (InputMismatchException e){
            System.out.println("Please enter numbers only.");
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }

        // (Q2) 2. Write a Java program that takes a number as input and prints its multiplication table up to

        try {
            System.out.println("Enter The Number: ");
            int number = input.nextInt();
            int mult = 1;
            for (int i = 1; i <= 10; i++) {

                mult = number * i;
                System.out.println(mult);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number only.");
        }

        // (Q3) Write a Java program to print the area and perimeter of a circle.
        try {
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();

            double area = 3.14 * radius * radius;
            double perimeter = 2 * 3.14 * radius;
            System.out.println("perimeter = " + perimeter);
            System.out.println("Area Is = " + area);
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number only.");
        }


        // (Q4) Java program to find out the average of a set of integers
        try {
            int sum = 0;
            double ave;
            for (int i = 1; i <= 6; i++) {
                System.out.println("Enter The Ineger Number:  ");
                int inNumber = input.nextInt();
                sum += inNumber;
            }
            ave = sum / 6;
            System.out.println("The Average: " + ave);
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number only.");
        }


        // (Q5) Write a Java program that accepts three integers as input, adds the first two integers together,
        // and then determines whether the sum is equal to the third integer.
        try {
            System.out.println("Enter first Integer Number: ");
            int num1 = input.nextInt();
            System.out.println("Enter Second Integer Number: ");
            int num2 = input.nextInt();
            System.out.println("Enter third Integer Number: ");
            int num3 = input.nextInt();
            int sumNumber = num1 + num2;
            if (sumNumber == num3) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }

        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number only.");
        }

        // (Q6) Write a Java program to reverse a word.

        try {

            System.out.println("Enter Word: ");
            String word = input.nextLine();

            if (word.isEmpty()) {
                throw new Exception();
            }

            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }

        } catch (Exception e) {

            System.out.println("Please enter a word.");

        }

        // (Q7) Java program to check whether the given number is even or odd

        try {

            System.out.println("Enter Number:");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("The Number Is Even");
            } else {
                System.out.println("The Number Is Odd");
            }

        } catch (InputMismatchException e) {

            System.out.println("Please enter a number only.");

        }

        // (Q8) Java program to convert the temperature in Centigrade to Fahrenheit
        try {
            System.out.println("Enter Temperature in Centigrade: ");
            float centigrade = input.nextFloat();


            double fahr = (centigrade * 1.8) + 32;

            System.out.println("Temperature in fahrehint is " + fahr);
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number only.");
        }

        // (Q9) .Write a Java program that takes a string and a number from the user,then prints the character in the given index.

        try {

            System.out.println("Enter the String:");
            String st = input.nextLine();

            System.out.println("Enter Number of index:");
            int numOfIndex = input.nextInt();

            char letter = st.charAt(numOfIndex);

            System.out.println("Letter: " + letter);

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Invalid index.");

        }
        // (Q10) Write a Java program to print the area and perimeter of a rectangle.

        try {

            System.out.println("Enter Width: ");
            float width = input.nextFloat();

            System.out.println("Enter Height: ");
            float height = input.nextFloat();

            double area = width * height;
            double perimeter = 2 * (width + height);

            System.out.println("Area Is: " + area);
            System.out.println("Perimeter Is: " + perimeter);

        } catch (InputMismatchException e) {

            System.out.println("Please enter numbers only.");

        }

        // (Q11) Write a Java program to compare two numbers.

        try {

            System.out.println("Enter the first Number: ");
            int number1 = input.nextInt();

            System.out.println("Enter the Second Number: ");
            int number2 = input.nextInt();

            if (number1 != number2) {
                System.out.println(number1 + " != " + number2);
            }

            if (number1 < number2) {
                System.out.println(number1 + " < " + number2);
            }

            if (number1 <= number2) {
                System.out.println(number1 + " <= " + number2);
            }

        } catch (InputMismatchException e) {

            System.out.println("Please enter numbers only.");

        }

        // (Q12) Write a Java program to convert seconds to hours, minutes and seconds.
        try {

            System.out.println("Enter Number for Seconds:");
            int seconds = input.nextInt();

            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            int remainingSeconds = seconds % 60;

            System.out.println(hours + ":" + minutes + ":" + remainingSeconds);

        } catch (InputMismatchException e) {

            System.out.println("Please enter numbers only.");

        }


        // Q(13) Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.

       try {
           System.out.println("Enter first Number: ");
           int num1 = input.nextInt();
           System.out.println("Enter second Number: ");
           int num2 = input.nextInt();
           System.out.println("Enter Three Number: ");
           int num3 = input.nextInt();
           System.out.println("Enter Fourth Number: ");
           int num4 = input.nextInt();

           if (num1 == num2 && num2 == num3 && num3 == num4) {
               System.out.println("All four Number are equal..");
           } else {
               System.out.println("All four Number are not equal...");
           }
       }
       catch (InputMismatchException e){
           System.out.println("Please enter numbers only.");
       }

        // (Q14) Write a Java program that reads an integer and check whether it is negative, zero, or positive.

       try {
           System.out.println("Enter Of Number: ");
           int num = input.nextInt();

           if (num > 0) {
               System.out.println("Number is positive");
           } else if (num == 0) {
               System.out.println("Number is Zero");
           } else {
               System.out.println("Number is negative");
           }
       }
       catch (InputMismatchException e){
           System.out.println("Please enter numbers only.");
       }

        // (Q15) 15.Write a program to enter the numbers till the user wants and at the end it
        // should display the count of positive, negative and zeros entered (End loop use -1 ,Don’t count -1
        int numberPositive = 0;
        int numberNegative = 0;
        int zero = 0;
        try {

            for (int i = 1; i <= 100; i++) {

                System.out.print("Enter number: ");
                int num = input.nextInt();

                if (num == -1) {
                    break;
                }

                if (num > 0) {
                    numberPositive++;
                } else if (num < 0) {
                    numberNegative++;
                } else {
                    zero++;
                }
            }

            System.out.println("Positive: " + numberPositive);
            System.out.println("Negative: " + numberNegative);
            System.out.println("Zero: " + zero);

        } catch (InputMismatchException e) {

            System.out.println("Please enter numbers only.");

        }
        // (Q16) Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
        try {

            System.out.print("Enter a number: ");
            String num = input.next();

            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) < '0' || num.charAt(i) > '9') {
                    throw new NumberFormatException();
                }
            }

            String reverse = "";

            for (int i = num.length() - 1; i >= 0; i--) {
                reverse = reverse + num.charAt(i);
            }

            System.out.println("Reversed: " + reverse);

        } catch (NumberFormatException e) {

            System.out.println("Please enter numbers only.");

        }

        // (Q17)Write a program to enter the numbers till the user wants and at the end
        // the program should display the largest and smallest numbers entered.
        /*int largNumber = 0;
        int smallNumber = 0;

        for (int i = 0; i < 100; i++) {

            System.out.print("Enter number: ");
            int number = input.nextInt();

            if (number == -1) {
                break;
            }

            if (i == 0) {
                largNumber = number;
                smallNumber = number;
            }

            if (number > largNumber) {
                largNumber = number;
            }

            if (number < smallNumber) {
                smallNumber = number;
            }
        }

        System.out.println("The large Number: " + largNumber);
        System.out.println("The Small Number: " + smallNumber);
        //-------------------------------
*/
        try {

            System.out.print("Enter number: ");
            int num = input.nextInt();

            int largest = num;
            int smallest = num;

            System.out.print("Do you want to continue? (1 = Yes, 0 = No): ");
            int choice = input.nextInt();

            while (choice == 1) {

                System.out.print("Enter number: ");
                num = input.nextInt();

                if (num > largest) {
                    largest = num;
                }

                if (num < smallest) {
                    smallest = num;
                }

                System.out.print("Do you want to continue? (1 = Yes, 0 = No): ");
                choice = input.nextInt();
            }

            System.out.println("Largest = " + largest);
            System.out.println("Smallest = " + smallest);

        } catch (InputMismatchException e) {

            System.out.println("Please enter numbers only.");

        }
        // (Q18)Determine and print the number of times the character ‘a’ appears in the input entered by the user.

        try {
            System.out.println("Enter The Word...");
            String word = input.nextLine();

            if (word.isEmpty()) {
                throw new Exception();
            }

            int count = 0;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a') {
                    count++;
                }
            }

            System.out.println("Output: Number of a's: " + count);

        } catch (Exception e) {
            System.out.println("Please enter a word.");
        }


    }
}
