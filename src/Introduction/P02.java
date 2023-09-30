package Introduction;

import java.util.Scanner;

/*
2. Write a program to print a given number without its last digit.
*/
public class P02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number");
        int number = in.nextInt();

        System.out.println("Number Without Last Digit: "+ number/10);

    }
}
