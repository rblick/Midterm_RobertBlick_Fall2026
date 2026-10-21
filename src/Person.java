/**
 * Midterm_RobertBlick_Fall2026
 */

public abstract class Person 
{
	final int personId;
	String name;
	String phoneNumber;
	static int personCount;
	
	public Person(int personId, String name, String phoneNumber) 
	{
		this.personId = personId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		personCount++;
	}
	
	public int getPersonCount() 
	{
		return personCount;
	}
	
	public String displayBasicDetails()
	{
		return "Person ID: " + personId + ", Name: " + name + ", Phone Number: " + phoneNumber;
	}
	
	public String toString()
	{
		return "";
	}
	
	abstract String getRoleDescription();
}

