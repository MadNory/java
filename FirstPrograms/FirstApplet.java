import java.applet.*;
import java.awt.*;

public class FirstApplet extends Applet
{
	public void paint(Graphics g)
	{
		String s = "Hello, 2 + 3 = " + (2 + 3);
		g.drawString(s, 25, 50);
		g.drawString("Goodbye!", 25, 100);
	}
}