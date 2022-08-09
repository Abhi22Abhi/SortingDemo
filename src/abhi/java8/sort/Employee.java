package abhi.java8.sort;

public class Employee {

	private int Id;
	private String Name;
	private String Grade;
	private int Sal;
	
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, String grade, int sal) {
		super();
		Id = id;
		Name = name;
		Grade = grade;
		Sal = sal;
	}


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public int getSal() {
		return Sal;
	}
	public void setSal(int sal) {
		Sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Grade=" + Grade + ", Sal=" + Sal + "]";
	}
	
	
}
