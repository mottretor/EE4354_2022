package week01.exercises;

public class LeapYear {
    public static void main(String[] args) {
        boolean result = isLeapYear(2012);
        System.out.println(result);

        
    }

    static boolean isLeapYear(int year){
        year = 2000;
        if (year%400 == 0) {
            return true;
        } else if(year%100 == 0){
            return false;
        }else if(year%4 == 0 ){
            return true;
        }else{
            return false;
        }
    }
}
