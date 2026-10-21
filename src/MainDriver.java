/**
 * Midterm_RobertBlick_Fall2026
 */

public class MainDriver 
{
	public static void main(String[] args) 
	{
		//Objects Instantiated
		Member m1 = new Member(1, "Robert Blick", "555-123-4567", 100001, 31, "Basic Membership", 54.01); 
		Member m2 = new Member(2, "Jane Doe", "555-555-5555", 100002, 56, "Premium Membership", 0.00); 
		Librarian l1 = new Librarian(3, "John Smith", "555-345-1237", 1, "Markham TPL", 6500.00, 37, 20);
		SeniorLibrarian sl1 = new SeniorLibrarian
				(4, "John Johnson", "555-825-4497", 2, "Refrence Library", 22000.00, 48, 40, "Classical", 2000);
		LibraryAssistant la1 = new LibraryAssistant
				(5, "Jack Johnson", "555-825-4497", 3, "Refrence Library", 3500.00, "Part-Time", 200);
		
		//Object Details
		System.out.println(m1.displayBasicDetails());
		System.out.println(m2.displayBasicDetails());
		System.out.println(l1.displayStaffDetails());
		System.out.println(sl1.displayStaffDetails());
		System.out.println(la1.displayStaffDetails());
		System.out.println();
		
		//Calculate Late Fees
		l1.calculateLateFee(10);
		l1.calculateLateFee(100, 0.20);
		System.out.println();
		
		//Calculate Monthly Compensation
		l1.calculateMonthlyCompensation();
		sl1.calculateMonthlyCompensation();
		la1.calculateMonthlyCompensation();
		System.out.println();
		
		//Get Person, Member, and Staff count
		System.out.println(m1.getPersonCount());
		System.out.println(m1.getMemberCount());
		System.out.println(l1.getStaffCount());
		System.out.println();
		
		//Polymorphism
		System.out.println(l1.getRoleDescription());
		System.out.println(sl1.getRoleDescription());
		System.out.println(la1.getRoleDescription());
		System.out.println();
		
		//Interfaces
		m1.reserveBook("Harry Potter");
		l1.generateReport();
		sl1.generateReport();
		la1.generateReport();
		System.out.println();
		
		//Success and Fail Registration
		m1.registerMember("Super Membership");
		m1.registerMember("Premium Membership");
		m1.registerMember("Premium Membership", -50.00);
		m1.registerMember("Premium Membership", 50.00);
	}	
}

