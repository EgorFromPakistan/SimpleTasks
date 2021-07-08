/**
 * Считать с консоли своё имя и возраст и вывести на экран Привет, меня зовут <имя>, мне <количество лет> лет.
 */

package module_1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String age = scanner.nextLine();
        System.out.println("меня зовут " + name + ", мне " + age + " лет");
    }
}
