import java.util.Scanner;

public class exercise_03 {
    public static void main(String[]args){
        Scanner readUserInPut = new Scanner(System.in);
        System.out.println("Please enter you number:");
        int  x,y,z;
        x = readUserInPut.nextInt();
        y = readUserInPut.nextInt();
        z = readUserInPut.nextInt();
        hasTeen(x,y,z);
    }

    public static boolean hasTeen(int x,int y,int z){
        if(isTeen(x))
            return true;
        if(isTeen(y))
            return true;
        if(isTeen(z))
            return true;
        else return false;
    }
    public static boolean isTeen(int x){
        if(x> 12 && x<20)
            return true;
        return false;
    }
}
