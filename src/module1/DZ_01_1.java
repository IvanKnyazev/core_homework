package module1;

import java.util.Scanner;

/**
 * @author Ivan Knyazev on 19.04.2017
 * @since JDK 1.8
 */
public class DZ_01_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = scanner.nextLine();
        scanner.close();

        System.out.println("\nHello, " + name);

    }
}
