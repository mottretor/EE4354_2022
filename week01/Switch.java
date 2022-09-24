package week01;

public class Switch {
    public static void main(String[] args) {
        int x = 5;
        switch(x){
            case 1:
                System.out.println("Green");
                break;
            case 2:
                System.out.println("Red");
                break;
            case 3:
                System.out.println("Blue");
                break;
            default:
                System.out.println("White");
                break;
        }
    }
}
