/**
 * вычислить ((sin(x)+cos(y))/(cos(x)-sin(y)))*tg(xy)
 */
package module_1.linear;

public class Task3 {
    public static void main(String[] args) {
        double x = 12;
        double y = -9;
        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("result = " + result);
    }
}
