package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "sbd.com";
	
	//Constructor to receive the firstName And lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email created: "+this.firstName+" "+this.lastName);
		
		//Call a method asking for Department and return department
		this.department = setDepartment();
		//System.out.println("Department: "+this.department);
		
		//Call a method that return a random password
		this.password = randomPassword(defaultPasswordLength);
		//System.out.println("This is your password :"+this.password);
		
		//Combine element to generate the email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Your email: "+email);
		
	}
	//Ask for the Department
	private String setDepartment() {
		System.out.print("Department Code: \n1 for Sales\n2 for Development\n3 for Accounting\no for None\n Enter Department Code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "Sales";}
		else if(depChoice == 2) {return "Development";}
		else if (depChoice == 3) {return "Accounting";}
		else {return "None";}
	}
	//Generate the random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@$#&";
		char[] password = new char[length];
		for(int i=0; i<length;i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set mail box capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	//Set alternate Email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {return mailBoxCapacity; }
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
}
