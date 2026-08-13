import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Aswer (Q1)

        /*System.out.println("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Secound Number: ");
        int num2 = input.nextInt();
        //int sum;
        System.out.println(num1+"+"+ num2 +"= "+num1+num2);
        System.out.println(num1+"-"+ num2 +"= "+(num1-num2));
        System.out.println(num1+"/"+ num2 +"= "+(num1/num2));
        System.out.println(num1+"*"+ num2 +"= "+(num1*num2));
        System.out.println(num1+"%"+ num2 +"= "+(num1%num2));*/

        // (Q2)

        /*System.out.println("Enter The Number: ");
        int number = input.nextInt();
        int mult = 1;
        for (int i = 1 ; i <= 10 ; i++){

            mult = number * i;
            System.out.println(mult);
        }*/

        // (Q3)

            /*System.out.println("Enter Radius:");
            double radius = input.nextDouble();
            *//*System.out.println("Enter the Perimeter");
            double perimeter = input.nextDouble();*//*

            double perimeter = radius * 3.14 * 2;
            double area = perimeter *2;
            System.out.println("perimeter = "+ perimeter);
            System.out.println("Area Is = " +area);*/


        // (Q4)
        /*int sum = 1;
        double ave = 1;
        for (int i = 1; i <= 5 ; i++){
            System.out.println("Enter The Ineger Number:  ");
            int inNumber = input.nextInt();
            sum += i ;
            ave = sum / i;
        }
        System.out.println("The Average: " + ave);*/

        // (Q5)
        /*System.out.println("Enter first Integer Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Second Integer Number: ");
        int num2 = input.nextInt();
        System.out.println("Enter third Integer Number: ");
        int num3 = input.nextInt();
        int sumNumber = num1 + num2;
        if (sumNumber == num3){
            System.out.println("true");

        }else {
            System.out.println("false");
        }*/

        // (Q6)

       /* System.out.println("Enter Of Word: ");

        String word = input.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }*/

        // (Q7)

        /*System.out.println("Enter Of Number");
        int number = input.nextInt();
        if ( number % 2 == 0){
            System .out.println("The Number Is Even");
        }
        else {
            System .out.println("The Number Is Odd");
        }*/

        // (Q8)

//        System.out.println("Enter Temperature in Centigrade: ");
//        float centigrade = input.nextFloat();
//
//
//        double fahr = (centigrade* 1.8) +32;
//
//        System.out.println("Temperature in fahrehint is" +fahr);


        // (Q9)

//        System.out.println("Enter the String");
//        String st = input.nextLine();
//
//        System.out.println("Enter Number of index");
//        int numOfIndex = input.nextInt();
//
//        char letter;
//
//        letter = st.charAt(numOfIndex);
//
//        System.out.println( letter);

        // (Q10)

        /*System.out.println("Enter With: ");
        float with = input.nextFloat();

        System.out.println("Enter Height: ");
        float height = input.nextFloat();

        System.out.println("Enter The Perimeter");
        int perimeter = input.nextInt();

        double result = with * height;
        double resP = perimeter * (with+height);

        System.out.println("Area Is: " +result);
        System.out.println("perimeter Is: (" +with + " + " + height +") = " +resP);*/

        // (Q11)

        /*System.out.println("Enter the firest Number: ");
        int number1 = input.nextInt();

        System.out.println("Enter the Second Number: ");
        int number2 = input.nextInt();


        if (number1 != number2) {
            System.out.println(number1 + "!=" + number2);
        }
        if (number1 < number2) {

            System.out.println(number1 + "<" + number2);
        }
        else {
            System.out.println(number1 + "<=" + number2);
        }*/

        // (Q12)

     /*   System.out.println("Enter Number for Seconds: ");

        int sec = input.nextInt(); // 7200

        int secToH = sec / 3600;  //7200 / 3600 == 2
        System.out.println(secToH);

        int secTosmun= sec / 60; // 180  / 60 == 30

        System.out.println(secTosmun);


        *//*int secTosmun= sec / 60;
        int mutTosec = secTosmun / 60;*//*


        //System.out.print(secTosmun);*/

        // Q(13)

        /*System.out.println("Enter first Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = input.nextInt();
        System.out.println("Enter Three Number: ");
        int num3 = input.nextInt();
        System.out.println("Enter Fourth Number: ");
        int num4 = input.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4){
            System.out.println(" if all four are equal..");
        }else {
            System.out.println("Number are not equal...");
        }*/

        // (Q14)

//        System.out.println("Enter Of Number: ");
//        int num = input.nextInt();
//
//        if (num > 0){
//            System.out.println("Number is positive");
//        } else if (num == 0) {
//            System.out.println("Number is Zero");
//        }
//        else {
//            System.out.println("Number is negative");
//        }

        // (Q15)



        /*int count =1 ;
        for (int i = 0 ; i <= count ;i++){
            System.out.println("Enter Of Number: ");
            int num = input.nextInt();
            if (num == -1){
                break;
            }
            if ( i > 0){
                System.out.println( i+ "Number is positive" );
            } else if (i < 0) {
                System.out.println(i +"Number is negative" );
            }
            count++;
        }*/


    }
}
