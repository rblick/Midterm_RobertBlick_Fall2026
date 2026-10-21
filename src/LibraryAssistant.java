/**
 * Midterm_RobertBlick_Fall2026
 */

public class LibraryAssistant extends LibraryStaff
{
	final String shiftType ;
	double shiftAllowance;
	
	public LibraryAssistant(int personId, String name, String phoneNumber, int personCount, int staffId, 
			String department, double monthlySalary, int staffCount, String shiftType, 
			double shiftAllowance) 
	{
		super(personId, name, phoneNumber, personCount, staffId, department, monthlySalary, staffCount);
		this.shiftType = shiftType;
		this.shiftAllowance = shiftAllowance;
	}
	
	public String getRoleDescription() 
	{
		return name + " is a library assistant.";
	}
	
	
	public void calculateMonthlyCompensation() 
	{
		double monthlyCompensation = (monthlySalary - (monthlySalary * shiftAllowance));
		System.out.println(name + "'s monthly compensation is: $" + monthlyCompensation);
	}
	
	@Override
	public String displayStaffDetails() 
	{
		return "Person ID: " + personId + ", Name: " + name + ", Phone Number: " + phoneNumber
				+ ", Person Count: " + personCount + ", Staff ID: " + staffId + ", Department: "
				+ department + ", Montly Salary: $" + monthlySalary + ", Staff Count: " + staffCount
				+ ", Shift Type: " + shiftType + ", Shift Allowance" + shiftAllowance;
	}
}

