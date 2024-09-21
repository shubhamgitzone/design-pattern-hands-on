package dpWithDurgesh.abstractFactoryPattern;

public class Client {

	public static void main(String[] args) {

		// I want to get Android dev
		Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
		e1.name();
		
		Employee e2= EmployeeFactory.getEmployee(new WebDevFactory());
		e2.name();
		
		Employee e3 = EmployeeFactory.getEmployee(new ManagerFactory());
		e3.name();
		// find diff b/w fctory and abstrctFctry DP
		// factory of factories
		// and one more layer of abstraction thus hiding implementation more securely
		// factory uses another factory to create object
	}

}
