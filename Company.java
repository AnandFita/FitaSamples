import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		Employee e1 = new Employee();;;
		e1.setId(103);
		e1.setName("xyz");
		e1.setDept("CSE");
		
		Employee e2 = new Employee();;;
		e2.setId(105);
		e2.setName("abc");
		e2.setDept("EEE");
		
		Employee e3 = new Employee();;;
		e3.setId(101);
		e3.setName("ghi");
		e3.setDept("E&I");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		printEmp(empList);
		
		Collections.sort(empList);
		System.out.println("***Sorted***");
		printEmp(empList);
		sortById(empList);
		System.out.println("***SortedByID()***");
		printEmp(empList);
	}
	
	private static void printEmp(List<Employee> empList){
		for (Employee employee : empList) {
			System.out.println(employee.getId() + "--" + employee.getName() + "--" + employee.getDept());
		}
	}
	
	private static void sortById(List<Employee> empList){
		Collections.sort(empList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getId() > o2.getId()) {
					return 1;
				}
				return -1;
			}
		});
	}
}
