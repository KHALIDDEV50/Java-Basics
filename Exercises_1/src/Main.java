import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner inputS = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("================Exercises_1=================");
        System.out.println("============================================");

        //==> Answer (Q1)
        /*Develop a program that takes the weight (in kilograms) and height (in meters)
            as input and calculates the BMI, then prints it. */
        /*
        System.out.println("Enter The Weight(kg): ");
        int weight = inputS.nextInt();

        System.out.println("Enter The Height(m)");
        float height = inputS.nextFloat();

        double calct = weight / height ;

        System.out.println("Calculate The BMI = " +calct);
        */
        // ==> Answer (Q2)
        /* Write a program that takes the obtained marks and total marks as input and
            calculates the percentage, then prints it.*/
        /*
        System.out.println("Enter Obtained Marks");
        float ObtMarks = inputS.nextFloat();
        System.out.println("Enter Total Mark");
        int totalMark = inputS.nextInt();
        float percentage = (ObtMarks / totalMark) * 100;

        System.out.println("The Percentage Mark: " + percentage + "%");
        */
        // ==> Answer (Q3)
        /* Create a program that takes an amount in one currency and an exchange rate
            as input, then converts and prints the amount in another currency.*/
        /*
        System.out.println("Enter The Amount In The Currency(USD):");
        double amount = inputS.nextDouble();
        System.out.println("Enter Exchange Rate (USD to EUR) :");
        double rate = inputS.nextDouble();

        double exchange_amount = amount * rate;
        System.out.println("Exchange The amount" +exchange_amount+"%");
        */
        // ==> Answer (Q4)
        /* Create a program that takes a string as input, calculates its length, and then
            reverses the string using the StringBuilder class, finally printing both the length and
            reversed string*/
        /*
        System.out.println("Enter The Data");
        String data = inputS.nextLine();
        int length =data.length();
        StringBuilder sb = new StringBuilder(data);
        String revers = sb.reverse().toString();
        System.out.println("calculates the string  length: "+length);
        System.out.println("calculates the string  reversed: "+revers);
        */
        // ==> Answer (Q5)
        /*Develop a program that takes a sentence as input and extracts a substring from
            it, then prints the extracted substring. */

        System.out.println("Enter Sentence: ");
        String sentence = inputS.nextLine();

        System.out.println("Enter Start Index ");
        int startIndex = inputS.nextInt(); // 10

        System.out.println("Enter End Index ");
        int endIndex = inputS.nextInt(); //15

        String result = sentence.substring(startIndex,endIndex);
        System.out.println("The Extracted Substring: \""+result+"\"");

        // ==> Answer (Q6)
        /* Write a program that takes a sentence and a keyword as input, then check if
            the keyword is present in the sentence and prints the result*/
        /*
        System.out.println("Enter Sentence: ");
        String sentenc = inputS.nextLine();

        System.out.println("Enter Keyword: ");
        String keyWord = inputS.nextLine();

        boolean res = sentenc.contains(keyWord);
        System.out.println("The sentence : " + sentenc);
        System.out.println("The result : " + res);
        */
        // ==> Answer (Q7)
        /* Develop a program that takes a sentence and a word to replace as input, then
            replace all occurrences of the word with another word and prints the modified
            sentence*/
        /*
        System.out.println("Enter Sentence: ");
        String sentencs = inputS.nextLine();

        System.out.println("Enter Word to Replace: ");
        String sent1 = inputS.nextLine();

        System.out.println("Enter New Word : ");
        String nSent2 = inputS.nextLine();
        inputS.nextLine();
        String resultReplacement = sentencs.replace(sent1, nSent2);
        System.out.println("The Modified Sentence: \"" + resultReplacement + "\"");
        */
        // ==> Answer (Q8)
        /* Write a program that takes two strings as input and check if they are equal,
            ignoring the case, then prints whether they are equal or not. */
        /*
        System.out.println("Enter String 1: ");
        String str1 = inputS.nextLine();

        System.out.println("Enter String 2: ");
        String str2 = inputS.nextLine();

        boolean resultIgnoringCase = str1.equalsIgnoreCase(str2);
        System.out.println("Strings for " + str1 + " and " + str2 + " are equal ==>" + resultIgnoringCase);
        */

    }
}
