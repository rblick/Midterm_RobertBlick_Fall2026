/**
 * Midterm_RobertBlick_Fall2026
 */

public class Member extends Person implements Reservable
{
	final int memberNumber;
	int age;
	String membershipType;
	double outstandingFees;
	static int memberCount;
	
	public Member(int personId, String name, String phoneNumber, int memberNumber,
			int age, String membershipType, double outstandingFees) 
	{
		super(personId, name, phoneNumber);
		this.memberNumber = memberNumber;
		this.membershipType = membershipType;
		
		if (age >= 18) 
		{
			this.age = age;
		}
		else 
		{
			System.out.println("Members must be 18 years or older!");
		}
		
		if (outstandingFees >= 0) 
		{
			this.outstandingFees = outstandingFees;
		}
		else 
		{
			System.out.println("Fee can not be less than zero!");	
		}
		
		memberCount++;
	}
	
	public int getMemberCount() 
	{
		return memberCount;
	}
	
	public String getRoleDescription() 
	{
		return name + "is a member.";
	}
	
	public void reserveBook(String bookId) 
	{
		System.out.println("Book ID: " + bookId + ", successfully reserved.");
	}
	
	public void registerMember(String newMembership) 
	{
		if (newMembership == "Basic Membership") 
		{
			outstandingFees = outstandingFees + 10.00;
			System.out.println("Membership successfully changed.");	
		}
		else if (newMembership == "Premium Membership")
		{
			outstandingFees = outstandingFees + 50.00;
			System.out.println("Membership successfully changed.");
		}
		else 
		{
			System.out.println("Memberships are either \"Basic Membership\" or \"Premium Membership\"!");
		}
	}
	
	public void registerMember(String newMembership, double feePayment) 
	{
		if (feePayment > 0)
		{
			if (newMembership == "Basic Membership") 
			{
				outstandingFees = outstandingFees + (10.00 - feePayment) ;
				System.out.println("Membership successfully changed. Payment accepted.");	
			}
			else if (newMembership == "Premium Membership")
			{
				outstandingFees = outstandingFees + (50.00 - feePayment);
				System.out.println("Membership successfully changed. Payment accepted.");
			}
			else 
			{
				System.out.println("Memberships are either \"Basic Membership\" or \"Premium Membership\"!");
			}
		}
		else 
		{
			System.out.println("Fee payment must be greater than zero.");
		}
	}
}

