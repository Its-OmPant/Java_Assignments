package Introduction;

import java.util.Scanner;

/*
* 1. Write a program to print unit digit of a given number
*/
public class P01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number");
        int number = in.nextInt();
        System.out.println("Unit digit: "+ number%10);
    }
}
