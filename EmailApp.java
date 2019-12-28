package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Shiv","Deep");
		
		em1.setAlternateEmail("shivbijaydeep@yahoo.com");
		System.out.println(em1.getAlternateEmail());

	}

}
