package tut1;
import java.util.*;

public class Sum4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int summ = 0;

        while (n > 0) {
            summ += n % 10;
            n /= 10;
        }

        System.out.println("Sum of digits: " + summ);

        sc.close();
    }
}