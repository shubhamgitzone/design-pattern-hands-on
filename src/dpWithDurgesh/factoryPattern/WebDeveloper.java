package dpWithDurgesh.factoryPattern;

public class WebDeveloper implements Employee {

	@Override
	public int getSalary() {
		System.out.println("Getting Web developer salary");
		return 40000;
	}

}
