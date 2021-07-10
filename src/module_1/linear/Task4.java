/**
 * дано число R вида nnn.ddd. Поменять местами целую и дробную часть, вывести результат
 */
package module_1.linear;

public class Task4 {
    public static void main(String[] args) {
        double R = 111.222;
        double result = (R * 1000) % 1000 + (int) R / 1000.0;
        System.out.println("result = " + result);
    }
}
