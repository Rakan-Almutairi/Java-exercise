package exercise_08;

import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        Person person= new Person();
        Scanner readUserInPut = new Scanner(System.in);
        System.out.println("first name:");
        String firstName = readUserInPut.nextLine();
        System.out.println("last name:");
        String firstLast = readUserInPut.nextLine();
        System.out.println("your age:");
        int age =readUserInPut.nextInt();
        person.setFirstName(firstName);
        person.setLastName(firstLast);
        person.setAge(age);
        System.out.println("you are teen? "+person.isTeen(person.getAge()));
        System.out.println("your name :"+person.getFullName());

    }
}
