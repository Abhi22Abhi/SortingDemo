package abhi.java8.sort;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoDummyDb {

	public static List<Employee> getEmployees() {
		
		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "abhi", "a", 500000));
		list.add(new Employee(2, "nani", "b", 400000));
		list.add(new Employee(3, "kaja", "a", 800000));
		list.add(new Employee(4, "gani", "a", 300000));
		list.add(new Employee(5, "roja", "b", 1500000));
		
		return list;
	}
}
