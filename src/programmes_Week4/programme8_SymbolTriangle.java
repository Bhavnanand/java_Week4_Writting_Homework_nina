package programmes_Week4;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class programme8_SymbolTriangle {
    public static void symbolTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
                System.out.println("");
            }

    }
        public static void main (String[]args){
            //scanne rdeclaration for reading the input from console
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number of rows");
            symbolTriangle((scanner.nextInt()));
            //closing scanner object
            scanner.close();
        }

    }
