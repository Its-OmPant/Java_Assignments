package Introduction;

import java.util.Scanner;

/*10. Write a program to input a number from the user and also input a digit. Append a
digit in the number and print the resulting number. (Example - number=234 and
digit=9 then the resulting number is 2349)
*/
public class P10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number :");
        int num = in.nextInt();

        System.out.println("Enter a Digit to append :");
        int digit = in.nextInt();
        int ans = num*10 + digit;

        System.out.println("Number with appended digit : "+ ans);
    }
}
