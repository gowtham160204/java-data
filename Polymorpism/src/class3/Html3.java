package class3;

public class Html3 implements Bank3 {

		public void current(){
			 System.out.println("current account");
		}
		public void savings(){
			 System.out.println("savings account");
		}
		public static void main(String []args){
			Html3 obj = new Html3 ();
			obj.current();
			obj.savings();
		
		}
	}
