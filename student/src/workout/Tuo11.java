package workout;
import java.util.Scanner;

public class Tuo11 {
	public static void main(String[] args) {
		Scanner rn = new Scanner (System.in);
		System.out.println("Enter a number");
		int n = rn.nextInt();
		int a, i = 0, j = 0;
		a = n;
		while (a > 0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;
			
		}
		if (n == j) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome ");
		}
	}

}
