package typing_java_programs_week4;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 *   *
 *   * *
 *   * * *
 *   * * * *
 *   * * * * *
 */
public class Programme_15_LeftTriangleStar {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int a = scanner.nextInt();
        leftTriangle(a);
        scanner.close();
    }
    public static void leftTriangle(int x){
        int i, j;
        for (i = 1; i <= x; i++ ){
            for (j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
