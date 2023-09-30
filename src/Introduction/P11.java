package Introduction;

import java.util.Scanner;

/*11. Assume price of 1 USD is INR 76.23. Write a program to take the amount in INR
and convert it into USD.
*/
public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount in INR ");
        int inr = sc.nextInt();
        float usd = inr / 76.23f;
        System.out.println("Amount in USD: " + usd);

    }
}
