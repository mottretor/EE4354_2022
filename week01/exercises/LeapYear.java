package week01.exercises;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2404;

        if (year%400 == 0) {
            System.out.println("Leap Year");
        } else if(year%100 == 0){
            System.out.println("Not a Leap Year");
        }else if(year%4 == 0 ){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
