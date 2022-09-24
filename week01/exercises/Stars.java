package week01.exercises;

public class Stars {
    public static void main(String[] args) {
        System.out.println("\n\nPattern 01\n");

        for (int i = 0; i < 10; i++) {
            System.out.print("* ");
        }

        System.out.println("\n\nPattern 02\n");

        for (int i = 0; i < 10; i++) {
            System.out.println("* ");
        }

        System.out.println("\n\nPattern 03\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("\n\nPattern 04\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("\n\nPattern 05\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("\n\nPattern 06\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
