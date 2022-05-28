package Homeworks;

public class coding_task_17 {
    public static void main(String[] args) {
        int John=(89+120+103)/3;
        int Mike=(116+94+123)/3;
        System.out.println("John's team scored an average of "+ John);
        System.out.println("Mike's team scored an average of "+ Mike);
        if(John>Mike){
            System.out.println("John's team scored more. Their score average was " + John);
        }
        else if(John<Mike){
            System.out.println("Mike's team scored more. Their score average was " + Mike);
        }
        else{
            System.out.println("It's a draw! Both of the teams scored " + John);
        }
    }
}
