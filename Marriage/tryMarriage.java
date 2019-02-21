public class tryMarriage
{
	public static void main(String[] args)
	{
		Person husband = new Person("Anthony", "Duque");
		Person wife = new Person("Marie Fe", "Cabreros");
		
		printNames(husband, wife);
		Marriage marriage = new Marriage(husband, wife);
		printNames(husband, wife);
	}

	private static void printNames(Person h, Person w)
	{
		System.out.println("Husband : " + h.getFullName() + "  ==  Wife: " + w.getFullName());
	}
}

