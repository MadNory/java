public class Marriage
{
	private Person wife, husband;

	public Marriage(Person hubby, Person wifey)
	{
		this.wife = wifey;
		this.husband = hubby;
		this.wife.setLastName(this.husband.getLastName());
	}
}