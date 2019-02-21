public class Person
{
	private String lastName;
	private String firstName;
	
	public Person(String fName, String lName)
	{
		this.firstName = fName;
		this.lastName = lName;
	}
	
	public void setLastName(String lName)
	{
		this.lastName = lName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public String getFullName()
	{
		return this.firstName + " " + this.lastName;
	}
}