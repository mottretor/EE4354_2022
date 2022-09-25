package week01.exercises;

public class Functions {
    public static void main(String[] args) {
        int[] myArray = new int[]{23, 25, 56, 980, 57, 79};
        System.out.println("Average : "+average(myArray));
        System.out.println("Max : "+max(myArray));
    }

    static int max(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if(max<i){
                max = i;
            }
        }
        return max;
    }

    static int average(int[] arr){
        int arrSize = arr.length; 
        int sum = 0; 
        for (int i : arr) {
            sum += i;
        }
        return sum/arrSize;
    }
}
