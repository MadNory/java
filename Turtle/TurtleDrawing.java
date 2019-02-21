import Turtle.*;
import Turtle.StdDraw.*;
import java.awt.Color;

public class TurtleDrawing
{
	public static void main(String[] args)
	{
        double x0 = 0.5;
        double y0 = 0.0;
        double a0 = 60.0;
        double step = Math.sqrt(3)/2;
		step = 0.3;
//        Turtle turtle = new Turtle(x0, y0, a0);
        Turtle turtle = new Turtle();
        StdDraw.enableDoubleBuffering();
		turtle.setPenRadius(0.01);
		turtle.setPenColor(Color.red);
        turtle.goForward(step);
        turtle.turnLeft(45);
		turtle.setPenColor(Color.blue);
        turtle.goForward(step);
        turtle.turnLeft(45);
		turtle.setPenColor(Color.green);
        turtle.goForward(step);
        turtle.turnLeft(45);
		turtle.setPenColor(Color.yellow);
        turtle.goForward(step);
        turtle.turnLeft(45.0);
        turtle.goForward(step * Math.sqrt(2));
		turtle.show();
	}
}