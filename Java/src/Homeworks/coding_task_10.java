package Homeworks;

import java.util.Scanner;

public class coding_task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First number please");
        int number1 = input.nextInt();
        System.out.println("Now the second one");
        int number2 = input.nextInt();
        System.out.println("Sum of the numbers is "+ (number1+number2));
        System.out.println("Multiplication of the numbers is "+ number1*number2);
        System.out.println("Remaining of the numbers is "+ (number1-number2));
        System.out.println("Division of the numbers is "+ number1/number2);
    }
}