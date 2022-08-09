package abhi.java8.sort;

import java.util.Comparator;
import java.util.List;

public class SortingCustomObjDemo__02 {

	public static void main(String[] args) {


		System.out.println("********Displaying Employees with out sorted()********"); 
		EmployeeDaoDummyDb.getEmployees().stream().forEach(emp -> System.out.println(emp));
		System.out.println();

		// Displaying Employees as per salary in Ascending Order
//		EmployeeDaoDummyDb.getEmployees().stream().sorted().forEach(emp -> System.out.println(emp)); // java.lang.ClassCastException


		
		System.out.println("********sorted(Pure LamdaExpression)********");
		EmployeeDaoDummyDb.getEmployees().stream()
				.sorted((emp1, emp2) -> emp2.getSal() - emp1.getSal())
				.forEach(emp -> System.out.println(emp));
		System.out.println();
		
		System.out.println("********sorted(Comparator.comparing(emp->emp.getSal()))********");
		List<Employee> employees = EmployeeDaoDummyDb.getEmployees();
		employees.stream()
				.sorted(Comparator.comparing(emp->emp.getSal()))
				.forEach(emp -> System.out.println(emp));
		System.out.println();
		
		System.out.println("********sorted(Comparator.comparing(Employee::geteSal))********");
		EmployeeDaoDummyDb.getEmployees().stream()
				.sorted(Comparator.comparing(Employee::getSal))
				.forEach(emp -> System.out.println(emp));
		System.out.println();
			
	}
}
