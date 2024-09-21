package dpWithDurgesh.builderDesignPattern;

public class Main {

	public static void main(String[] args) {

		User user = new User
				.UserBuilder()
				.setEmail("shubham@dev.in")
				.setUserId("userID123")
				.setUserName("Shubham")
				.build();
		
		System.out.println(user);
	}

}
