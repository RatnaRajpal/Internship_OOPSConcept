/*Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square.
Use Quadrilateral as the super class of the hierarchy. The instance variables of Quadrilateral should be
the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that instantiates
objects of your classes and outputs each object's area (except Quadrilateral)*/

package internship_Foxmula;

public class Rectangle extends Quadrilateral{
Rectangle(int xy[][]){
setcoordinate(xy);
}
int area(){
	int ar1=(int)Math.sqrt((xy[0][0]-xy[1][0])*(xy[0][0]-xy[1][0])+(xy[0][1]-xy[1][1])*(xy[0][1]-xy[1][1]));
int ar2=(int)Math.sqrt((xy[0][0]-xy[3][0])*(xy[0][0]-xy[3][0])+(xy[0][1]-xy[3][1])*(xy[0][1]-xy[3][1]));
	return ar1*ar2;
}
}
