/**
 * Midterm_RobertBlick_Fall2026
 */

public abstract class LibraryStaff extends Person implements Reportable
{
	final int staffId;
	String department;
	double monthlySalary;
	static int staffCount;
	
	public LibraryStaff(int personId, String name, String phoneNumber, int staffId, 
			String department, double monthlySalary) 
	{
		super(personId, name, phoneNumber);
		this.staffId = staffId;
		this.department = department;
		this.monthlySalary = monthlySalary;
		staffCount++;
	}
	
	public int getStaffCount() 
	{
		return staffCount;
	}
	
	abstract String getRoleDescription();
	abstract void calculateMonthlyCompensation();
	
	public String displayStaffDetails() 
	{
		return "Person ID: " + personId + ", Name: " + name + ", Phone Number: " + phoneNumber + ", Staff ID: " 
				+ staffId + ", Department: " + department + ", Montly Salary: $" + monthlySalary;
	}
	
	public void generateReport() 
	{
		System.out.println("Report for " + name +" generated.");
	}
}

