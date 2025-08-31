public class reverse1 {
    public static void main(String[] args) {
        int a = 12345678;
        int c = 0;
        int b;

        while(a!=0){
            b = a%10;
            c = c*10+b;
            a=a/10;
        }
    System.out.println(c);
        
    }
}
