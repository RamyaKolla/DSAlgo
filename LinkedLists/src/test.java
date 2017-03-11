
public class test {

	public static void main(String[] args) {
		test t = new test();
		t.method(null);
	}

	public void method(Object b){
		 System.out.println("OBJECT");
	}
	
	public void method(String b){
		 System.out.println("String");
	}
}
