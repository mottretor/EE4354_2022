package week01.exercises;

public class Factorial {
    public static void main(String[] args) {
        int counter = 3;
        int factorial = 1;
        while(counter>0){
            factorial *= counter;
            counter--;
        }
        System.out.println(factorial);
    }
}
