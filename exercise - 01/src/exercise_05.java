import java.util.Scanner;

public class exercise_05 {
    public static void main(String[]args){
        Scanner readUserInPut = new Scanner(System.in);
        System.out.println("Please enter you first number:");
        int  y;
        boolean x = true;
        y = readUserInPut.nextInt();
        x = readUserInPut.nextBoolean();
        isCatPlaying(x,y);
    }

    public static boolean isCatPlaying(boolean summer,int temperature){
        if(summer){
            if ((25 <= temperature) && (temperature <=45))
                return true;
            else return false;
        }else if ((25 <= temperature) && (temperature <=35))
            return true;
        else return false;
    }
}
