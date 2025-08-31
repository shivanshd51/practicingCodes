import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("the number is even.");
        }
        else{
            System.out.println("the number is odd.");
        }
    }
}
