
public class Organization {

	public static void main(String[] args) {

		Employee e = new Employee();
		try {
			e.setId(0);
			e.setName("Test");
			System.out.println(e.getName());
			System.out.println("Employee created successfully");
		} catch (InvalidEmployeeException ex) {
			System.out.println("Error creating employee");
			ex.printStackTrace();
		}
		finally{
			System.out.println("Finally");
		}

	}

}
