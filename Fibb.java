package tut2;
import java.util.*;

public class Fibb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int end = sc.nextInt();

        int a = 0, b = 1;

        while (a <= end) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}