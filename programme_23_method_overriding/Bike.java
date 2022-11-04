package programme_23_method_overriding;
/**
 * Creating a child class
 */
public class Bike extends Vehicle{
    public static void main(String[] args) {
        Bike obj = new Bike(); // creating object
        obj.run();//calling method
    }
    //defining the same method as in the parent class

    @Override
    public void run() {
        System.out.println("Bike is running safely.....");
    }
}
