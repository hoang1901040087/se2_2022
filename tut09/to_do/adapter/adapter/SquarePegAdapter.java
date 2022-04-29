package tuts.tut9.todo.adapter.adapter;

import tuts.tut9.complete.adapter.round.RoundPeg;
import tuts.tut9.complete.adapter.square.SquarePeg;
import java.lang.Math;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
	//TO-DO: Declare an attribute: name = peg, type = SquarePeg
	SquarePeg peg;

    //TO-DO: Declare the constructor with a parameter
	SquarePegAdapter(SquarePeg peg){
		this.peg = peg;
	}

    //TO-DO: Implement getRadius() method
    @Override
    public double getRadius() {
        return Math.sqrt(peg.getSquare*2);
    }
}