package workout;
import java.util.Scanner;

public class Tuo7 {
	public static void main(String[] args) {
		int a,b, c;
		Scanner sw = new Scanner(System.in);
		System.out.println("Numbers");
		a = sw.nextInt();
		b = sw.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("swaping");
		System.out.println(a);
		System.out.println(b);
	}

}
