package module1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ivan Knyazev on 19.04.2017
 * @since JDK 1.8
 */
public class DZ_01_2 {
    public static void main(String[] args) {

        int count = 1;
        int size = 5;
        int[] arrNumber = new int[size];
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter five integer numbers\n");

        try {
            for (i = 0; i < arrNumber.length; i++) {
                System.out.println("Enter number" + count++ + ": ");
                arrNumber[i] = scanner.nextInt();
            }
            System.out.print("Initial array: " + Arrays.toString(arrNumber));
        }
        catch (Exception e){
            System.out.println("Error, please enter correct number");
        }

        Arrays.sort(arrNumber);
        System.out.print("\nSorted array:  " + Arrays.toString(arrNumber));

        scanner.close();
    }
}
