package Homeworks;

public class coding_task_3 {
    public static void main(String[] args) {
        int number = 350;
        int number2 = 2;
        int number3 = 3;
        int number4 = 5;
        boolean b = number % number3 == 0;
        boolean c = number % number4 == 0;
        boolean a = number % number2 == 0;
        if (a){    // it can be (a == true)
            System.out.println(number + " is divisible by " + number2);
        }
        else {
            System.out.println(number + " is not divisible by " + number2);
        }
        if (b){
            System.out.println(number + " is divisible by " + number3);
        }
        else {
            System.out.println(number + " is not divisible by " + number3);
        }if (c){
            System.out.println(number + " is divisible by " + number4);
        }
        else {
            System.out.println(number + " is not divisible by " + number4);
        }


    }
}
