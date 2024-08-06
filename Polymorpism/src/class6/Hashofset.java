package class6;
import java.util.HashSet;

public class Hashofset {
	public static void main(String[] args) {
		HashSet<String> obj = new HashSet<String>();
		obj.add("red");
		obj.add("blue");
		System.out.println(obj.contains("red"));
	}

}
