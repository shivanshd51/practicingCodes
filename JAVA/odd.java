import java.util.Scanner;

public class odd {

    public static void main(String[] args) {
        // finding the number is even or odd   

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number you want to check:");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("The number is Even.");
        }
        else{
            System.out.println("The number is Odd.");
        }
    }
}