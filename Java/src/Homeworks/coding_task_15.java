package Homeworks;
import java.util.Scanner;
public class coding_task_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("AVERAGE CALCULATOR");
        System.out.println("First number please");
        int number1= input.nextInt();
        System.out.println("Second number please");
        int number2= input.nextInt();
        System.out.println("Third number please");
        int number3= input.nextInt();
        int average=((number1+number2+number3)/3);
        System.out.println("Average of those 3 numbers is " + average);
    }
}