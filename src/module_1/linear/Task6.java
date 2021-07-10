package module_1.linear;

public class Task6 {
    public static void main(String[] args) {
        int yTopMin = 0;
        int yTopMax = 4;
        int xTopMin = -2;
        int xTopMax = 2;

        int yBottomMin = -3;
        int yBottomMax = 0;
        int xBottomMin = -4;
        int xBottomMax = 4;

        int x = 1;
        int y = 2;

        System.out.println("is belong = " +
                ((x >= xTopMin && x <= xTopMax && y >= yTopMin && y <= yTopMax)
                        || (x >= xBottomMin && x <= xBottomMax && y >= yBottomMin && y <= yBottomMax)));
    }
}
