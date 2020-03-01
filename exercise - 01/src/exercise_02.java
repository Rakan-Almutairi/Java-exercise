import java.util.Scanner;

public class exercise_02 {
    public static void main(String[]args){
        Scanner readUserInPut = new Scanner(System.in);
        System.out.println("Please enter you the Year:");
        int  x,y;
        x = readUserInPut.nextInt();
        isLeapYear(x);
    }
    public static boolean isLeapYear(int year){
        if(!(year >=1 && year <=9999)){
            return false;
        }
        if(year%4==0) {
            if (!(year % 100 == 0)) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}
