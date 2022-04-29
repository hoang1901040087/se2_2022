package tuts.tut9.todo.adapter;

import tuts.tut9.complete.adapter.adapter.SquarePegAdapter;
import tuts.tut9.complete.adapter.round.RoundHole;
import tuts.tut9.complete.adapter.round.RoundPeg;
import tuts.tut9.complete.adapter.square.SquarePeg;

/**
 * Somewhere in client code...
 */
public class Demo {
	public static void main(String[] args) {
		//TO-DO: Create 2 instances of RoundHole and RoundPeg with same radius
		RoundHole roundHole = new RoundHole(9);
		RoundPeg roundPeg = new RoundPeg(9);
	 
		//TO-DO: If RoundHole instance can "fits" with RoundPeg instance => show a message
		if(roundHole.fit(roundPeg)){
			System.out.println("Hello world!");
		}
	 
		//TO-DO: Create 2 instances of SquarePeg with 2 different widths
		SquarePeg squarePeg1 = new SquarePeg(1);
		SquarePeg squarePeg2 = new SquarePeg(2);
 
		//Note: You can't make RoundHole instance "fit" with SquarePeg instance
		//Therefore, we need to use Adapter for solving the problem.
		
		//TO-DO: Create 2 corresponding instances of SquarePegAdapter  
		SquarePegAdapter squarePegAdapter1 = new SquarePegAdapter(squarePeg1);
		SquarePegAdapter squarePegAdapter2 = new SquarePegAdapter(squarePeg2);
		 
		//TO-DO: If the RoundHole instance can "fits" with "small" RoundPegAdapter instance 
		//show a suitable message
		if(roundHole.fit(squarePegAdapter1)) System.out.println("Fit small");
		
	 
		//TO-DO: If the RoundHole instance can not "fits" with "big" RoundPegAdapter instance 
		//show a suitable message
		if(roundHole.fit(squarePegAdapter2)) System.out.println("Fit big");
	}
}