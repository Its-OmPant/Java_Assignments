package Introduction;

import java.util.Scanner;

/*
* 5. Write a program to input a three digit number and display the sum of the digits.
* */
public class P05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a three digit Number");
        int num = in.nextInt();

        int sum = 0;
        while(num!=0){
            sum += num%10;
            num/= 10;
        }
        System.out.println("Sum is :" +sum);
    }
}
