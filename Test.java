
public class Test {

	public Test() {
		System.out.println("F");
	}

	public static void main(String[] args) {

		//calls instance block and contructor for every object creation
		Test t = new Test();
		Test t1 = new Test();

		try {
			int a = 2;
			System.out.println("A");
		} catch (Exception e) {
			System.out.println("B");
		} finally {
			System.out.println("C");
		}
	}

	//1.static block
	static {
		System.out.println("D");
	}

	//instance block
	{
		System.out.println("E");
	}

}