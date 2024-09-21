package dpWithDurgesh.factoryPattern;

public class DeveloperClient {

	public static void main(String[] args) {
		
		Employee e = new AndroidDeveloper();
		// this is tightly coupled way and it will introduce coding nightmare
		
		// so we'll create a factory class for getting employee object
		
		Employee employee = EmployeeFactory.getEmployee("Web developer ");
		System.out.println(employee.getSalary());
		
	}
}
