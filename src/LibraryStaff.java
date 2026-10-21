/**
 * Midterm_RobertBlick_Fall2026
 */

public abstract class LibraryStaff extends Person implements Reportable
{
	final int staffId;
	String department;
	double monthlySalary;
	static int staffCount;
	
	public LibraryStaff(int personId, String name, String phoneNumber, int personCount, int staffId, 
			String department, double monthlySalary, int staffCount) 
	{
		super(personId, name, phoneNumber, personCount);
		this.staffId = staffId;
		this.department = department;
		this.monthlySalary = monthlySalary;
		this.staffCount = staffCount;
	
	}
	
	abstract String getRoleDescription();
	abstract void calculateMonthlyCompensation();
	
	public String displayStaffDetails() 
	{
		return "Person ID: " + personId + ", Name: " + name + ", Phone Number: " + phoneNumber
				+ ", Person Count: " + personCount + ", Staff ID: " + staffId + ", Department: "
				+ department + ", Montly Salary: $" + monthlySalary + ", Staff Count: " + staffCount;
	}
	
	public void generateReport() 
	{
		System.out.println("Report for" + name +"Generated.");
	}
}

