package typing_java_programs_week4;
/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
import java.util.Scanner;

public class Programme_9_FibonacciNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Imput fibonacci series count: ");
        isFibonacci(scanner.nextInt());
        scanner.close();
    }
    public static void isFibonacci(int count){
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        //loop starts from 2 as 0 and 1 are already printed
        for (int i = 2; i < count; ++i){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }

}
