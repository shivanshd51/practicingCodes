class pen{
    String color;
    String type; //ball/gel

    public static void write(){
        System.out.print("Write Something");

    }

    public  void printColor(){
        System.out.println(this.color);
    }
    public  void printType(){
        System.out.println(this.type);
    }
}

public class makingclass {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color="blue";
        pen1.type="ball";

        // pen.write();

        pen pen2 = new pen();
        pen2.color="black";
        pen2.type="gel";

        // pen1.printColor();
        // pen2.printColor();

        // pen1.printType();
        // pen2.printType();




    }
}
