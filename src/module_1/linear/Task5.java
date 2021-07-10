/**
 * Дано натуральное число T, отрое представляет длительность прошедшего времени в секундах. Вывести данное значение
 * длительности в часах, минутах, секундах в следующей формк HHч MMмин SSc
 */

package module_1.linear;

public class Task5 {
    public static void main(String[] args) {
        int T = 3671;
        int hours = T / (60 * 60);
        int minutes = (T - hours * 60 * 60) / 60;
        int seconds = T - hours * 60 * 60 - minutes * 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
    }
}
