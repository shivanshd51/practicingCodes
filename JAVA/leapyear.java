import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year you want to Check:");
        int year = input.nextInt();
        if(year%4==0){
            System.out.println("It is a Leap Year..");
        }
        else{
            System.out.println("It is not a Leap Year..");
        }
    }
}
