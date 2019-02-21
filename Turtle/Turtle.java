package Turtle;

import java.awt.Color;
import Turtle.StdDraw.*;

public class Turtle {

	private double x, y;		// turtle is at (x, y)
	private double angle; 		// facing this many degrees counterclockwise from the x-axis
	
	
	// Start at (x0, y0), facing a0 degrees counterclockwise
	public void turnLeft(double delta)
	{
		angle += delta;
	}
	
	public void turnRight(double delta)
	{
		angle -= delta;
	}

	// move forward the given amount, with the pen down
	public void goForward(double step)
	{
		double oldx = x;
		double oldy = y;
		
		x += step * Math.cos(Math.toRadians(angle));
		y += step * Math.sin(Math.toRadians(angle));
		
		StdDraw.line(oldx, oldy, x, y);
	}
	
	public void show()			// copy to onscreen
	{
		StdDraw.show();
	}
	
	public void pause(int t)	// pause t in milliseconds
	{
		StdDraw.pause(t);
	}
	
	public void setPenColor(Color color)
	{
		StdDraw.setPenColor(color);
	}
	
	public void setPenRadius(double radius)
	{
		StdDraw.setPenRadius(radius);
	}
	
	public void setCanvasSize(int width, int height)
	{
		StdDraw.setCanvasSize(width, height);
	}
	
	public void setXscale(double min, double max)
	{
		StdDraw.setXscale(min, max);
	}
	
	public void setYscale(double min, double max)
	{
		StdDraw.setYscale(min, max);
	}
	
    public static void main(String[] args)
	{
	}
}