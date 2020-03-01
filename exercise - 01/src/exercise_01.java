import java.util.Scanner;

public class exercise_01 {
    public static void main(String[]args){
        Scanner readUserInPut = new Scanner(System.in);
        System.out.println("Please enter you first number:");
        int  x,y;
        x = readUserInPut.nextInt();
        printMegaBytesAndKiloBytes(x);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0)
            System.out.println("Invalid Value");
        else{
            int Megabytes=0;
            int remainKiloBytes=kiloBytes;
            while(remainKiloBytes>1024){
                Megabytes++;
                remainKiloBytes=remainKiloBytes-1024;
            }
            System.out.println(kiloBytes+" KB= "+ Megabytes +" MB and " +remainKiloBytes+" KB");
        }
    }
}
