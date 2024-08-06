package class6;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class Date1 {
	public static void main(String[]args) {
		LocalDate a = LocalDate.now();
		System.out.println(a);
		LocalTime b = LocalTime.now();
		System.out.println(b);
		LocalDateTime c = LocalDateTime.now();
		System.out.println(c);
		
	}

}
