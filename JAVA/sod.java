import java.util.Scanner;

public class sod {
    public static void main(String[] args) {
        // sum of digits 1234 = 10

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to check:");
        int num = sc.nextInt();
        int b = 0;

        while(num!=0){
            int c=num%10;
            b=b+c;
            num=num/10;
        }
        System.out.println(b);
    }
}
