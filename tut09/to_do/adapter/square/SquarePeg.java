package tuts.tut9.todo.adapter.square;

/**
 * SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */
public class SquarePeg {
	//TO-DO: Declare an attribute: name = width, type = double
	doudle width;
   
	//TO-DO: Declare the constructor with a parameter
     SquarePeg(double width){
		 this.width = width;
	 }
	//TO-DO: Implement getWidth() method
    public double getWidth() {
		return width;
    }

    //TO-DO: Implement getSquare() method
    public double getSquare() {
        return width * width;
    }
}
