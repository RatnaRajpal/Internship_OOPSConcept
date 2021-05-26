/*Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square.
Use Quadrilateral as the super class of the hierarchy. The instance variables of Quadrilateral should be
the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that instantiates
objects of your classes and outputs each object's area (except Quadrilateral)*/

package internship_Foxmula;

class Parallelogram extends Quadrilateral{
	private int height;
	Parallelogram(int xy[][],int height)
	{
	setcoordinate(xy);
	this.height=height;
	}
	int area()
	{
	int d1=(int)Math.sqrt((xy[0][0]-xy[1][0])*(xy[0][0]-xy[1][0])+(xy[0][1]-xy[1][1])*(xy[0][1]-xy[1][1]));
	return d1*height;
	}

}
