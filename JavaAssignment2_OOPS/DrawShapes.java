
public class DrawShapes 
{
	public static void main(String[] args) 
	{
		Line l = new Line();
		l.draw();
		Shape r = new Rectangle();
		r.draw();
		Cube c = new Cube();
		c.draw();
	}
}

abstract class Shape
{
	abstract void draw();
}

class Line extends Shape
{
	@Override
	void draw() {
		System.out.println("Drawing Line...");		
	}	
}

class Rectangle extends Shape
{
	@Override
	void draw() {
		System.out.println("Drawing Rectangle...");
	}	
}

class Cube extends Shape
{
	@Override
	void draw() {
		System.out.println("Drawing Cube...");
	}	
}