/**
 * Считать с консоли строку со своим девизом по жизни и выведи ее 5 разю.
 */

package module_1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String motto = scanner.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println(motto);
        }
    }
}
