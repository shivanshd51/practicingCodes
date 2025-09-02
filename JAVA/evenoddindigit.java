public class evenoddindigit {
    public static void main(String[] args) {
        int num = 12346;
        int b= 0;
        int even = 0;
        int odd = 0;

        while(num!=0){
            b=num%10;
            if(b%2==0){
                even=even+1;
            }
            else{
                odd=odd+1;
            }
            num=num/10;

        }
        System.out.print("Number of even numbers:");
        System.out.println(even);
        System.out.print("Number of odd numbers:");
        System.out.println(odd);
    }
}
