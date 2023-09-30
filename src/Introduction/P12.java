package Introduction;

import java.util.Scanner;

/*12. Write a program to take a three-digit number from the user and rotate its digits by
one position towards the right.*/
public class P12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Three Digit Number");
        int num = in.nextInt();
        int ans= num%10;
        num/=10;
        int temp = num;
        while(temp != 0){
            ans*=10;
            temp/=10;
        }
        ans = ans + num;
        System.out.println(ans);
    }
}
