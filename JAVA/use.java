class Student{
    int roll;
    String name;
    double per;
}
public class use {
    public static void main(String[] args) {
        Student s = new Student();
        s.roll=23;
        s.name="Shivansh";
        s.per=85.5;
        System.out.println(s.roll);
        System.out.println(s.name);
        System.out.println(s.per);
    }
}
