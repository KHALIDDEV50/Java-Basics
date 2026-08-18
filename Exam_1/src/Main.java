import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // (Q1) Write a Java program that accept three numbers from the user and print the largest number .

        /*System.out.println("Enter frist Number: ");
        int number = input.nextInt();
        System.out.println("Enter Secound Number: ");
        int number2 = input.nextInt();
        System.out.println("Enter threed Number: ");
        int number3 = input.nextInt();
        //int result = number;

        if (number > number2 && number > number3){
            System.out.println("The largest Number:" +number);
        } else if (number2 > number && number2 > number3) {
            System.out.println("The largest Number:" +number2);

        }
        else {
            System.out.println("The largest Number:" +number3);

        }
*/
        // (Q2) Write a Java program that accept a String and a number from the user, then print the character at the given index( the number) .

        /*System.out.println("Enter The Word: ");
        String st = input.nextLine();

        System.out.println("Enter the Number Of Index: ");
        int numberOfIndex = input.nextInt();

        char reslt = st.charAt(numberOfIndex);

        System.out.println("the character is: "+reslt);*/

        // (Q3) Write a Java program that allows the user to enter numbers repeatedly until they choose to stop, then displays the total sum of all entered numbers.
        // int count = 1;
        /*int totalSum = 0;
        for (int i = 1; i <= 3; i++) {

            System.out.println("Enter Number");
            int number = input.nextInt();
            totalSum = totalSum +  i;
        }
        System.out.println("The Total Sum: " + totalSum);*/

        // (Q4) Write a Java program to determine whether each number in a given array is positive or negative.
        //  [10, -21 , 30, 31, -25]

       /* System.out.print("Enter The Size Of Array Number: ");
        int size = input.nextInt();*/
        int number [] = new int [4];
        for (int i = 0 ; i <= 4 ; i++){
            System.out.print("Enter The Array Number: " +i);
            number[i] = input.nextInt();
            System.out.println(number[i]);
        }



        /*int number [] = {10, -21 , 30, 31, -25};

        for(int i = 0 ; i <=4 ; i++){
            System.out.print(number[i]);
            if (number[i] > 0){
                System.out.println(number[i]+" positive");
            }
            else {
                //System.out.println(number[i]+" negative");
            }
        }*/


        //(Q5) Write a Java program to find the shortest word in a given array of strings
       /* String arrs [] = {"Tuwaiq","Bootcamp","Student","JAVA"};

            System.out.println(arrs[3]);*/


    }

}


