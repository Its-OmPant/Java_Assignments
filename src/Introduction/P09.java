package Introduction;

import java.util.Scanner;

/*9. Write a program to make the last digit of a number stored in a variable as zero.
(Example - if x=2345 then make it x=2340)*/
public class P09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = in.nextInt();
        num /= 10;
        num *= 10;
        System.out.println(num);
    }
}
