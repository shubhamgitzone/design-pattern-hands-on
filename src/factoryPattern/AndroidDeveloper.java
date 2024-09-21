package factoryPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int getSalary() {
		System.out.println("Getting Andriod developer salary");
		return 50000;
	}

}
