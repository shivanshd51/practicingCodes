import java.util.Scanner;

public class LOTN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number:");
        int c = sc.nextInt();

        if((a>b)&&(b>c)){
            System.out.print("the greates value is:");
            System.out.println(a);
        }
        else if((a>c)&&(c>b)){
            System.out.print("the greates value is:");
            System.out.println(a);
        }
        else if((b>c)&&(c>a)){
            System.out.print("the greates value is:");
            System.out.println(b);
        }
        else if((b>a)&&(a>c)){
            System.out.print("the greates value is:");
            System.out.println(b);
        }
        else if((c>a)&&(a>b)){
            System.out.print("the greates value is:");
            System.out.println(c);
        }
        else if((c>b)&&(b>a)){
            System.out.print("the greates value is:");
            System.out.println(c);
        }
        
    }
}
