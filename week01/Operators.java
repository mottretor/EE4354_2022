package week01;

public class Operators {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        x = ++x + y-- - x++;
        System.out.println(x);
        System.out.println(y);

        y = --y + ++x + --y;
        System.out.println(x);
        System.out.println(y);
    }
}
