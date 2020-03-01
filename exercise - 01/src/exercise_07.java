import java.util.Scanner;

public class exercise_07 {
    public static void main(String[]args){
        Scanner readUserInPut = new Scanner(System.in);
        System.out.println("Please enter you first number:");
        int  x,y;
        x = readUserInPut.nextInt();
        isPalindrome(x);
    }
    public static boolean isPalindrome(int number){
        int lastDigit=0,revers=0;
        int firstDigit =number;
        while(firstDigit != lastDigit) {
            lastDigit = number % 10;
            System.out.println("\nLastDigit ="+lastDigit +" number ="+ number);
            while(firstDigit>0 && firstDigit/10 !=0)
                firstDigit=firstDigit / 10;
            firstDigit=firstDigit / 10;
            System.out.println("firtDigit ="+firstDigit+"\nrevers ="+revers+"LastDigit ="+lastDigit +" number ="+ number);
        }            if (firstDigit == lastDigit) {
            System.out.println("True");
            return true;
        }
        return false;
    }
}
