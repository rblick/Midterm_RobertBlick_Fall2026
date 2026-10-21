/**
 * Midterm_RobertBlick_Fall2026
 */

public class Member extends Person implements Reservable
{
	final int memberNumber;
	int age;
	String membershipType;
	double outstandingFees;
	
	public Member(int personId, String name, String phoneNumber, int personCount, int memberNumber,
			int age, String membershipType, double outstandingFees) 
	{
		super(personId, name, phoneNumber, personCount);
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
	}
	
	public String getRoleDescription() 
	{
		return name + "is a member.";
	}
	
	public void reserveBook(String bookId) 
	{
		System.out.println("Book ID: " + bookId + " successfully reserved.");
	}
	
	public void registerMember(String newMembership) 
	{
		membershipType = newMembership;
		System.out.println("Membership successfully changed.");
	}
}

