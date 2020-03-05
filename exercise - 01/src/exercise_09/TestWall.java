package exercise_09;

import java.util.Scanner;

public class TestWall {
    public static void main(String[]args){
        Wall wall= new Wall();
        Wall wall01=new Wall(4,5);
        Scanner readUserInPut = new Scanner(System.in);
        System.out.println("Enter the width:");
        wall.setWidth(readUserInPut.nextDouble());
        System.out.println("Enter the high:");
        wall.setHeight(readUserInPut.nextDouble());
        System.out.println("The area :"+ wall.getArea());
        System.out.println("The area :"+ wall01.getArea());

    }
}
