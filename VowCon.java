package tut1;
import java.util.*;

public class VowCon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character: ");
		String x=sc.next();
		
		switch(x.toLowerCase()){
		
		case "a","e","i","o","u":
			System.out.println("Vowel");
			break;
			
		default:
			System.out.println("Consonant");
			break;
		}
        sc.close();
    }
}
