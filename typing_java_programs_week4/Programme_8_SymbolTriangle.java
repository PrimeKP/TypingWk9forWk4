package typing_java_programs_week4;
/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
import java.util.Scanner;

public class Programme_8_SymbolTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int a = scanner.nextInt();
        symbolTriangle(a);
        scanner.close();
    }
    public static void symbolTriangle(int number){
        for(int i = 0; i <= number; i++){
            for(int j = 0; j < i; j++){
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
