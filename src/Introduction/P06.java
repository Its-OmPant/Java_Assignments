package Introduction;

import java.util.Scanner;

/*6. Write a program which takes a character as an input and displays its ASCII code.*/
public class P06 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a Character :");
    char ch = in.next().toCharArray()[0];
    System.out.println("Ascii of " + ch + " = " + (int)ch);
    }
}
