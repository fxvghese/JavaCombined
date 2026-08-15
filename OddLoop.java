package tut1;
import java.util.*;

public class OddLoop {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
