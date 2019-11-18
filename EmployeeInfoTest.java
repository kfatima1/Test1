package Encapsulation;

public class EmployeeInfoTest {

	public static void main(String[] args) {
		Employee E = new Employee ();
		
		E.setSalary(100000);
		System.out.println(E.getSalary());
		
		E.setId(654332);
		System.out.println(E.getId());
		
		E.setName("Fatima K");
		System.out.println(E.getName());
		
		E.setAge(23);
		System.out.println(E.getAge());
		
		E.setDept("IT");
		System.out.println(E.getDept());
		
		

	}

}
