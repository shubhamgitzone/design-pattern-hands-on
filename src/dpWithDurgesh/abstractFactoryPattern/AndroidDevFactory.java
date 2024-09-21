package dpWithDurgesh.abstractFactoryPattern;

public class AndroidDevFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		return new AndroidDeveloper();
	}
}
