package class3;

public class Argument {

	public void studentdetails(String Name){
		System.out.println(Name);
	}
	public void studentdetails(long phone){
		System.out.println(phone);
	}
	public void studentdetails(int age){
		System.out.println(age);
	}
	public static void main(String []args){
		Argument obj  = new Argument();
			obj.studentdetails("gowtham");
			obj.studentdetails(7708517178l);
			obj.studentdetails(20);
	}
}
