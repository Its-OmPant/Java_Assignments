package Introduction;

import java.util.Scanner;

/*
3. Write a program to swap values of two int variables
*/
public class P03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two Number");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Number1 :"+ num1 + " Number2:"+ num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swap: ");
        System.out.println("Number1: "+ num1 + " Number2: "+ num2);
    }
}
