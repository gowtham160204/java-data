package class6;
import java.util.Scanner;
public class Classinput {
	public static void main(String[]args) {
		System.out.println("enter your deatials");
		Scanner obj = new Scanner(System.in);
		String name = obj.nextLine();
		System.out.println("user name is "+ name);
		
		int age = obj.nextInt();
		System.out.println("user age is "+ age);
		
	}

}
