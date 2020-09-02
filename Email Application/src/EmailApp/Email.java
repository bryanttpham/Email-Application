package EmailApp;
import java.util.Scanner;

public class Email {
	

private String firstName;
private String lastName;
private String password;
private String department;
private String email;
private String companySuffix="aeycompany.com";
private int mailboxCapacity=500;
private String alternateEmail;
private int defaultPasswordLength=10;

//Constructor
public Email(String first, String last)
{
	firstName=first;
	lastName=last;
//	System.out.println("EMAIL CREATED: " + firstName+ " "+lastName);
	System.out.println(firstName+" "+ lastName);
	this.department=setDepartment();
//	System.out.println("Department: "+ this.department);
	
	this.password=randomPassword(defaultPasswordLength);
	System.out.println("Your password is: "+ this.password);
	
	email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
//	System.out.println("Your email is: "+ email);
}

//Ask for department
private String setDepartment()
{
	System.out.println("Enter the department \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
	Scanner scan=new Scanner(System.in);
	int depChoice =scan.nextInt();
	if(depChoice==1) {return "sales";}
	else if(depChoice==2) {return "development";}
	else if(depChoice==3) {return "accounting";}
	else {return "";} 
	 	
}

//Create a random password
private String randomPassword(int length)
{
	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
	char[] password= new char[length];
	for(int i=0;i<length;i++)
	{
		int rand=(int) (Math.random()* passwordSet.length());
		password[i]= passwordSet.charAt(rand);
		
	}
	return new String(password);
	
}


//Set the mailbox capacity
public void setMailboxCapacity(int capacity) {
	mailboxCapacity=capacity;
}
//Set the Alternate email

public void setAlternameEmail(String alternate)
{
	alternateEmail=alternate;
}
//Change password

public void changePassword(String password)
{
	this.password=password;
}

public int getMailboxCapacity()
{
	return mailboxCapacity;
}

public String getAlternateEmail()
{
	return alternateEmail;
}

public String getPassword()
{
	return password;
}

public String showInfo()
{
	return "Display name: "+firstName+" "+lastName+
			"\nCompany Email: "+ email+
			"\nMailbox Capacity: "+mailboxCapacity+ "mb";
}

}

