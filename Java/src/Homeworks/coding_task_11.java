package Homeworks;
import java.util.Scanner;
public class coding_task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number please");
        int number = input.nextInt();
        for (int i=0;i<11;i++){
            System.out.println(number*i);
        }
    }
}
