package Introduction;

import java.util.Scanner;

/*7. Write a program to check whether the given number is even or odd using a bitwise
operator.*/
public class P07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = in.nextInt();
        if((num&1) == 1)
            System.out.println("Odd Number");
        else
            System.out.println("even Number");
    }
}
