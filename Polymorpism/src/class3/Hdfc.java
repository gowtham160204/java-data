package class3;

public class Hdfc extends Bank2 {

	public void salary(){
		 System.out.println("salary account");
	}
	public void savings(){
		 System.out.println("savings account");
	}
	public static void main(String []args){
		Hdfc obj = new Hdfc ();
		obj.salary();
		obj.savings();
		obj.current();
	}
}
