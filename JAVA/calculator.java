import java.util.Scanner;

public class calculator {

    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("1)Addition\n2)Subtraction\n3)Multiplication\n4)Division\nWhat do you want to do enter your choice:");
        int choice= input.nextInt();
        if(choice==1){
            int num1=input.nextInt();
            int num2=input.nextInt();
            System.out.println(num1+num2);
        }
    }
}