public class palindrome1 {
    public static void main(String[] args) {
        int a = 1;
        int d=a;
        int c = 0;
        int b;

        while(a!=0){
            b = a%10;
            c = c*10+b;
            a=a/10;
        }
        
        if(d==c){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
}
