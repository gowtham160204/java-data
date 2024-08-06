package workout;

import java.util.Scanner;

public class Tuo8 {
	public static void main(String[] args) {
		int a,b;
		Scanner sw = new Scanner(System.in);
		System.out.println("Numbers");
		a = sw.nextInt();
		b = sw.nextInt();
		a =a + b;
		b =a - b;
		a =a - b;
		System.out.println("swaping");
		System.out.println(a);
		System.out.println(b);
	}

}
