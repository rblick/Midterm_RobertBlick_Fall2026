/**
 * Midterm_RobertBlick_Fall2026
 */

public class SeniorLibrarian extends Librarian
{
	final String specialization;
	double seniorityAllowance;

	public SeniorLibrarian(int personId, String name, String phoneNumber, int personCount, int staffId, 
			String department, double monthlySalary, int staffCount, int dailyIssueLimit, 
			int booksProcessed, String specialization, double seniorityAllowance) 
	{
		super(personId, name, phoneNumber, personCount, staffId, department, monthlySalary, staffCount, 
				dailyIssueLimit, booksProcessed);
		
		this.specialization = specialization;
		this.seniorityAllowance = seniorityAllowance;
	}
	
	public String getRoleDescription() 
	{
		return name + " is a senior librarian.";
	}

	public void calculateMonthlyCompensation() 
	{
		double monthlyCompensation = (monthlySalary - (monthlySalary * seniorityAllowance));
		System.out.println(name + "'s monthly compensation is: $" + monthlyCompensation);
	}
	
	@Override
	public String displayStaffDetails() 
	{
		return "Person ID: " + personId + ", Name: " + name + ", Phone Number: " + phoneNumber
				+ ", Person Count: " + personCount + ", Staff ID: " + staffId + ", Department: "
				+ department + ", Montly Salary: $" + monthlySalary + ", Staff Count: " + staffCount
				+ ", Daily Issue Limit: " + dailyIssueLimit + ", Books Processed: " + booksProcessed
				+ ", Specialization: " + specialization + ", Seniority Allowance: " + seniorityAllowance;
	}
}

