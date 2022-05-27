package Homeworks;

import java.util.Scanner;

public class coding_task_9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("MULTIPLIER");
        System.out.println("First Number please");
        int number1=input.nextInt();
        System.out.println("What do you want to multiply " + number1 + " with?");
        int number2=input.nextInt();
        System.out.println("CONGRATS! YOUR RESULT IS "+ number1 * number2 + "!");
    }
}
