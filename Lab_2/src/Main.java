import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        /*----------------------Lab_2----------------------*/

        /*(Q1)-1.Write a program to find all of the longest word in a given dictionary.
         * "cat", "dog", "red", "is", "am"*/
        System.out.println("Enter Size Of Array:");
        int size = input.nextInt();

        String[] arrWord = new String[size];

        input.nextLine();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter word: " + (i + 1));
            arrWord[i] = input.nextLine();
        }

        for (int i = 0; i < size; i++) {
            System.out.print("{" + arrWord[i] + "} ");
        }

        System.out.println();

// Search for longest word
        int max = arrWord[0].length();

        for (int i = 1; i < size; i++) {
            if (arrWord[i].length() > max) {
                max = arrWord[i].length();
            }
        }

// Print all longest words
        for (int i = 0; i < size; i++) {
            if (arrWord[i].length() == max) {
                System.out.print("{" + arrWord[i] + "} ");
            }
        }

       /* *//*(Q2)-. Write a program that displays the number of occurrences of an element in the array.*//*
        System.out.println("Enter Size Of Array:");
        int size = input.nextInt();
        int[] number = new int[size];
        int count = 0;
        for (int i = 0 ; i < size ; i++){
            System.out.println("Enter Number"+(i+1));
            number[i] = input.nextInt();
        }
        System.out.println("Enter number to search:");
        int search = input.nextInt();

        for (int j = 0 ; j < size ; j++){
            if ( number[j] == search){
                count++;
            }
        }
        System.out.println(search + " occurs " + count + " times");

        *//*(Q3).Write a program to find the k largest elements in a given array. Elements in the array can be in any order.*//*
        System.out.println("Enter Size Of Array:");
        int size = input.nextInt();

        int[] number = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Number " + (i + 1));
            number[i] = input.nextInt();
        }

        System.out.println("Enter K:");
        int k = input.nextInt();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (number[i] < number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.println(  k + " largest elements of the said array are:");

        for (int i = 0; i < k; i++) {
            System.out.print(number[i] + " ");
        }

        *//*(Q4).Create a method to reverse an array of integers. Implement the method without creating a new array.*//*
        int[] numbers = {10, 20, 30, 40, 50};
        reverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        *//*(Q5)5. Write a menu driven Java program with following option:
         * 1- Accept elements of an array
         * 2- Display elements of an array
         * 3- Search the element within array
         * 4- Sort the array 5. To Stop
         * 5-the size of the array should be entered by the user.
         * *//*
        System.out.println("Enter size of array:");
        int size = input.nextInt();

        int[] arr = new int[size];

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n1- Accept elements");
            System.out.println("2- Display elements");
            System.out.println("3- Search element");
            System.out.println("4- Sort array");
            System.out.println("5- Stop");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    for (int i = 0; i < size; i++) {
                        System.out.print("Enter number " + (i + 1) + ": ");
                        arr[i] = input.nextInt();
                    }
                    break;

                case 2:
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter number to search: ");
                    int search = input.nextInt();

                    boolean found = false;

                    for (int i = 0; i < size; i++) {
                        if (arr[i] == search) {
                            found = true;
                        }
                    }

                    if (found) {
                        System.out.println("Element found");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;

                case 4:
                    for (int i = 0; i < size - 1; i++) {
                        for (int j = i + 1; j < size; j++) {

                            if (arr[i] > arr[j]) {
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }

                    System.out.println("Array sorted");
                    break;
                case 5:
                    System.out.println("Program stopped");
                    break;
                case 6:
                    System.out.println("Enter size of array:");


                    int[] arr = new int[size];

                default:
                    System.out.println("Invalid choice");
            }
        }
        *//*(Q6)Create a method that generates a random number within a given range. Allow the user to specify the range and call the method to display random numbers
        Hint: use Random class.*//*

        System.out.print("Enter minimum: ");
        int min = input.nextInt();

        System.out.print("Enter maximum: ");
        int max = input.nextInt();

        System.out.println("Random Number: " + randomNumber(min, max));

        *//*(Q7)Write a program that checks the strength of a password. Create a method that evaluates a password based on
         criteria like length, inclusion of special characters,
         and uppercase/lowercase letters.
         - We have three methods: checkLength, checkSpecialCharacters, and checkUpperCaseLowerCase,
          each of which assigns a score based on specific criteria.
          - The totalScore is calculated by adding the scores from these methods.
          - Classify the password as strong (8 or more), moderately strong (5 or more), or weak
          based on the totalScore.
          -The criteria for scoring:
             - Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters (3 points).
             - Special characters: Absence (0 points), Presence (2 points).
             - Uppercase and lowercase letters: Absence of both (0 points), presence of both (3 points).*//*
        System.out.print("Enter password: ");
        String password = input.nextLine();

        int totalScore = checkLength(password)
                + checkSpecialCharacters(password)
                + checkUpperCaseLowerCase(password);

        System.out.println("Score: " + totalScore);

        if (totalScore >= 8) {
            System.out.println("Strong Password");
        } else if (totalScore >= 5) {
            System.out.println("Moderately Strong Password");
        } else {
            System.out.println("Weak Password");
        }

         *//*(Q8)Create a method that generates the Fibonacci sequence up to a specified number of terms
         Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
         and each subsequent number in the sequence is the sum of the two preceding ones.*//*
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int n = input.nextInt();

        fibonacci(n);


    }

    *//*----------------------Methods----------------------*//*
    *//*Method For (Q4) *//*
    public static void reverseArray(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];

            arr[i] = arr[arr.length - 1 - i];

            arr[arr.length - 1 - i] = temp;
        }
    }

    *//*----------------------Methods----------------------*//*
    *//*Method For (Q6) *//*
    static Random random = new Random();

    public static int randomNumber(int min, int max) {

        return random.nextInt(max - min + 1) + min;
    }

    *//*----------------------Methods----------------------*//*
    *//*Method For (Q7) *//*
    static int checkLength(String password) {

        if (password.length() <= 5) {
            return 0;
        } else if (password.length() <= 7) {
            return 2;
        } else {
            return 3;
        }
    }

    static int checkSpecialCharacters(String password) {

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                return 2;
            }
        }

        return 0;
    }

    static int checkUpperCaseLowerCase(String password) {

        boolean upper = false;
        boolean lower = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper = true;
            }

            if (Character.isLowerCase(ch)) {
                lower = true;
            }
        }

        if (upper && lower) {
            return 3;
        }

        return 0;
    }
    *//*----------------------Methods----------------------*//*
    *//*Method For (Q7) *//*

    public static void fibonacci(int n) {

        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }*/

    }
}
