package class2;
import java.util.LinkedList;

public class Child2 {
	public static void main(String[]agrs) {
		LinkedList<Integer> number = new LinkedList<Integer>();
		number.add(22);
		number.add(23);
		number.add(24);
		number.add(25);
		number.add(26);
		System.out.println(number);
		System.out.println(number.get(1));
		int sum=0;
		for (int i=0; i<=4; i++ ) {
		    sum = sum+number.get(i);
		    
		}
		System.out.println(sum);
	}
   
}
