import java.util.Scanner;

public class exercise_04 {
    public static void main(String[]args){
        Scanner readUserInPut = new Scanner(System.in);
        System.out.println("Please enter number:");
        long  x;
        x = readUserInPut.nextInt();
        printYearsAndDays(x);
    }

    public static  void printYearsAndDays(long minutes){
        if (minutes <0 )
            System.out.print("Invalid Value");
        else{
            int day= (int) ((minutes/60)/24);
            int year=(day/365);
            day=day - (year*365) ;
            System.out.print(minutes+" min = "+ year +" y and "+day+" d ");
        }
    }
}
