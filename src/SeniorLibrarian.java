/**
 * Midterm_RobertBlick_Fall2026
 */

public class SeniorLibrarian extends Librarian
{
	final String specialization;
	double seniorityAllowance;

	public SeniorLibrarian(int personId, String name, String phoneNumber, int staffId, 
			String department, double monthlySalary, int dailyIssueLimit, 
			int booksProcessed, String specialization, double seniorityAllowance) 
	{
		super(personId, name, phoneNumber, staffId, department, monthlySalary, 
				dailyIssueLimit, booksProcessed);
		
		this.specialization = specialization;
		this.seniorityAllowance = seniorityAllowance;
	}
	
	public String getRoleDescription() 
	{
		return name + " is a senior librarian.";
	}
	
	@Override
	public void calculateMonthlyCompensation() 
	{
		final double processingBonus = 2.0;
		double monthlyCompensation = monthlySalary + (processingBonus * booksProcessed) + seniorityAllowance;
		
		System.out.println(name + "'s monthly compensation is: $" + monthlyCompensation);
	}
	
	@Override
	public String displayStaffDetails() 
	{
		return "Person ID: " + personId + ", Name: " + name + ", Phone Number: " + phoneNumber + ", Staff ID: " 
				+ staffId + ", Department: " + department + ", Montly Salary: $" + monthlySalary 
				+ ", Daily Issue Limit: " + dailyIssueLimit + ", Books Processed: " + booksProcessed
				+ ", Specialization: " + specialization + ", Seniority Allowance: " + seniorityAllowance;
	}
}

