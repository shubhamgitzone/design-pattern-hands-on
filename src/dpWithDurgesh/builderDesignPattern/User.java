package dpWithDurgesh.builderDesignPattern;

public class User {

	private final String userId;
	private final String userName;
	private final String email;

	private User(UserBuilder builder) {
		// initialize
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.email = builder.email;

	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + "]";
	}
	
	// inner class to create object
	static class UserBuilder {

		private String userId;
		private String userName;
		private String email;

		public UserBuilder() {

		}

		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public User build() {
			User user = new User(this);
			return user;
		}
	}

	
}
