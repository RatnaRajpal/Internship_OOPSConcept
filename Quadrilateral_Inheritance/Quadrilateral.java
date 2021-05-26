/*Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square.
Use Quadrilateral as the super class of the hierarchy. The instance variables of Quadrilateral should be
the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that instantiates
objects of your classes and outputs each object's area (except Quadrilateral)*/

package internship_Foxmula;

public class Quadrilateral {
	int xy[][]=new int[4][2]; //4 end points specified
	void setcoordinate(int xy[][]){
		for(int i=0;i<4;i++)
		for(int j=0;j<2;j++)
		this.xy[i][j]=xy[i][j];
		}
	
}
