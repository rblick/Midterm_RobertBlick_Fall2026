/**
 * Midterm_RobertBlick_Fall2026
 */

public class Librarian extends LibraryStaff
{
	final int dailyIssueLimit;
	int booksProcessed;
	
	public Librarian(int personId, String name, String phoneNumber, int staffId, 
			String department, double monthlySalary, int dailyIssueLimit, 
			int booksProcessed) 
	{
		super(personId, name, phoneNumber, staffId, department, monthlySalary);
		this.dailyIssueLimit = dailyIssueLimit;
		this.booksProcessed = booksProcessed;
	}
	
	public String getRoleDescription() 
	{
		return name + " is a librarian.";
	}
	
	public void calculateMonthlyCompensation() 
	{
		final double processingAllowance = 0.10;
		final double processingBonus = 2.0;
		double monthlyCompensation = 
				((monthlySalary + (processingBonus * booksProcessed)) - (monthlySalary * processingAllowance));
		System.out.println(name + "'s monthly compensation is: $" + monthlyCompensation);
	}
	
	public void calculateLateFee(int daysOverdue) 
	{
		double dailyRate = 1.00;
		
		if (daysOverdue >= 0) 
		{
			double lateFees = (daysOverdue * dailyRate);
			System.out.println("Late fees are: $" + lateFees);	
		}
		else 
		{
			System.out.println("Days overdue must be a possitive ammount.");
		}
	}
	
	public void calculateLateFee(int daysOverdue, double dailyRate) 
	{
		if (daysOverdue >= 0) 
		{
			if (dailyRate >= 0) 
			{
				double lateFees = (daysOverdue * dailyRate);
				System.out.println("Late fees are: $" + lateFees);	
			}
			else 
			{
				System.out.println("Daily rate must be a valid ammount!");
			}	
		}
		else 
		{
			System.out.println("Days overdue must be a possitive ammount!");
		}
	}
	
}

