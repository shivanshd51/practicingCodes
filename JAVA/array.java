public class array {
    public static void main(String[] args) {
        //sum of elements in array
        int[] a = {6,7,5,5};
        int len = a.length;
        int b = 0;
        for(int i =0;i<len;i++){
            b=b+a[i];
        }
        System.out.print("Sum of array elements are:");
        System.out.println(b);
    }
}
