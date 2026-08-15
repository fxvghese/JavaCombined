package tut2;
import java.util.*;

public class Pali {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        int temp = input;
        int rev = 0;

        while (input != 0) {
            rev = rev * 10 + input % 10;
            input /= 10;
        }

        if (temp == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");

        sc.close();
    }
}