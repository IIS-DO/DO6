package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Line;
import mvc.Point;

public class Test {

	public static void main(String[] args) {
		DrawingModel model = new DrawingModel();
		Point p = new Point(10, 10, Color.RED);
		
		CmdPointAdd c1 = new CmdPointAdd(model, p);
		c1.execute();
		System.out.println(model.getShapes().size());
		
		CmdPointRemove c2 = new CmdPointRemove(model, p);
		c2.execute();
		System.out.println(model.getShapes().size());
		
		Point oldState = new Point(10, 10, Color.RED);
		Point newState = new Point(20, 20, Color.BLUE);
		
		CmdPointUpdate c3 = new CmdPointUpdate(oldState, newState);
		c3.execute();
		
		System.out.println("oldState -> " + oldState);
		System.out.println("newState -> " + newState);
		
		c3.unexecute();
		
		Line lin1 = new Line(oldState, newState, Color.RED);
		Line lin2 = new Line(newState, oldState, Color.BLUE);
		
		CmdLineUpdate c4 = new CmdLineUpdate(lin1, lin2);
		c4.execute();
		
		System.out.println(lin1);
		System.out.println(lin2);
		
		oldState.setX(30);
		
		c4.unexecute();
		
		System.out.println(lin1);
		System.out.println(lin2);

	}

}
