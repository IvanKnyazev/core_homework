package module1.module1_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ivan Knyazev on 20.04.2017
 * @since JDK 1.8
 */
public class DZ_1 {
    public static void main(String[] args) {

        int size;
        int[] arrNumber;
        int i;
        int count = 1;
        int item;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter array size:\n");

        size = scanner.nextInt();
        arrNumber = new int[size];
        System.out.println("Please, enter array elements: ");

        for (i = 0; i < arrNumber.length; i++) {
            System.out.print("\tenter element " + count++ + ": ");
            arrNumber[i] = scanner.nextInt();
            }

        System.out.println("\nYour array: " + Arrays.toString(arrNumber));

        System.out.println("\n\t\tMenu:\n\t(operations on an array)\n-------------------------------");
        System.out.println("\t1.Search a number by index");
        System.out.println("\t2.Sort ascending");
        System.out.println("\t0.Exit menu");
        System.out.println("-------------------------------");

        System.out.print("\nSelect of menu item: ");
        item = scanner.nextInt();

        switch (item){
            case 1:
                System.out.print("Enter the index of the array from 0 to " + --size + ": ");
                int index = scanner.nextInt();
                System.out.print("Number by index [" + index + "]: is " + arrNumber[index]);
                break;
            case 2:
                Arrays.sort(arrNumber);
                System.out.print("Ascending sorted array:" + Arrays.toString(arrNumber));
                break;
            case 0:
                break;
            default:
                System.out.println("Please, enter correct menu item");
        }

        scanner.close();
    }
}
