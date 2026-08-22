import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // (Q1) 1.Write a Java program to test if the first and the last element of an array of integers are same.
        // The length of the array must be greater than or equal to 2 Test Data:

        /*System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        if (numbers[0] == numbers[size - 1]) {
            System.out.println("First and last elements are same");
        } else {
            System.out.println("First and last elements are not same");
        }*/

        // (Q2) 2.Write a Java program to find the numbers greater than the average of the numbers of a given array.
        // Original Array: [1, 4, 17, 7, 25, 3, 100]

        /*System.out.print("Enter array size: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Number: " + i );
            numbers[i] = input.nextInt();
            sum = sum + numbers[i];
        }
        double average =  sum / size;
        System.out.println("The average of the said array  = " + average);
        System.out.println("Numbers greater than average:");

        for (int i = 0; i < size; i++) {
            if (numbers[i] > average) {
                System.out.println(numbers[i]);
            }
        }*/

    // (Q3).Write a Java program to get the larger value between first
        // and last element of an array of integers. [20, 30, 40]

        /*System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        if (numbers[0] > numbers[size - 1]) {
            System.out.println("LLarger value between first and last element: " + numbers[0]);
        } else {
            System.out.println("LLarger value between first and last element:  " + numbers[size - 1]);
        }*/

        // (Q4) 4.Write a Java program to swap the first and
        // last elements of an array and create a new array. New array after swapping the first and last elements: [40, 30, 20]
        /*System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();


        }

        for (int i = 0; i < size; i++) {
            newArray[i] = numbers[i];
        }

        newArray[0] = numbers[size - 1];
        newArray[size - 1] = numbers[0];

        for (int i = 0; i < size; i++) {

            System.out.print(+newArray[i] + " ");
        }*/

        // (Q5) Write a program that places the odd elements of an array before the even elements.

        System.out.println("Enter Array:");

        System.out.println("Enter Arry: ");
        int arr[] = new int[9];
        for (int i =0 ; i < 9 ; i++){
            arr[i] = input.nextInt();   
        }


        // (Q6) Write a program that test the equality of two arrays. [3,1,5,9,7,2,40,4,10]
        /*int[] array1 = new int[9];
        int[] array2 = new int[9];

        System.out.println("Enter first array:");
        for (int i = 0; i < 9; i++) {
            array1[i] = input.nextInt();
        }
        System.out.println("Enter second array:");
        for (int i = 0; i < 9; i++) {
            array2[i] = input.nextInt();
        }

        boolean same = true;

        for (int i = 0; i < 9; i++) {
            if (array1[i] != array2[i]) {
                same = false;
            }
        }
        if (same) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }*/


    }
}