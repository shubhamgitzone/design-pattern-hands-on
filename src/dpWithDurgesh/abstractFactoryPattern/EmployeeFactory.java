package dpWithDurgesh.abstractFactoryPattern;

public class EmployeeFactory {
	
	//get the Employee
	public static Employee getEmployee(EmployeeAbstractFactory factory){
		return factory.createEmployee();
	}

}
