package workout;
import java.util.Scanner;

public class Tuo9 {
	public static void main(String[] args) {
		Scanner rn = new Scanner(System.in);
		System.out.println("number");
		int n = rn.nextInt();
		int a, i = 0, j = 0;
		a = n;
		while (a>0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;
		}
		System.out.println("reversed");
		System.out.println(j);
	}
	

}
