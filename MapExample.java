import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample {
	Map<Integer, Employee> empDetails= new HashMap<>();

	public void loadEmp(){
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("ABC");

		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("XYZ");
		
		empDetails.put(e1.getId(), e1);
		empDetails.put(e2.getId(), e2);
	}
}
