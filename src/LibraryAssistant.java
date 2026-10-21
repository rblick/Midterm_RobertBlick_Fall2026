/**
 * Midterm_RobertBlick_Fall2026
 */

public class LibraryAssistant extends LibraryStaff
{
	final String shiftType ;
	double shiftAllowance;
	
	public LibraryAssistant(int personId, String name, String phoneNumber, int staffId, 
			String department, double monthlySalary, String shiftType, 
			double shiftAllowance) 
	{
		super(personId, name, phoneNumber, staffId, department, monthlySalary);
		this.shiftType = shiftType;
		this.shiftAllowance = shiftAllowance;
	}
	
	public String getRoleDescription() 
	{
		return name + " is a library assistant.";
	}
	
	
	public void calculateMonthlyCompensation() 
	{
		double monthlyCompensation = monthlySalary + shiftAllowance;
		System.out.println(name + "'s monthly compensation is: $" + monthlyCompensation);
	}
	
	@Override
	public String displayStaffDetails() 
	{
		return "Person ID: " + personId + ", Name: " + name + ", Phone Number: " + phoneNumber
				+ ", Staff ID: " + staffId + ", Department: " + department + ", Montly Salary: $" 
				+ monthlySalary + ", Shift Type: " + shiftType + ", Shift Allowance" + shiftAllowance;
	}
}

