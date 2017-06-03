import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;





public class Graffiti {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setPenColor(Color.CYAN);
		r2d2.setSpeed(10);
		r2d2.move(250);
		r2d2.turn(90);
		r2d2.move(250);
		r2d2.turn(90);
		r2d2.move(250);
		r2d2.turn(90);
		r2d2.move(250);
		r2d2.setPenColor(Color.RED);
		r2d2.move(250);
		r2d2.turn(90);
		r2d2.move(250);
		r2d2.turn(90);
		r2d2.move(250);
		r2d2.penUp();
		r2d2.turn(90);
		r2d2.move(250);
		r2d2.penDown();
		r2d2.setPenColor(Color.yellow);
		r2d2.move(250);
		r2d2.turn(90);
		r2d2.move(250);
		r2d2.turn(90);
		r2d2.move(250);
		r2d2.penUp();
		r2d2.turn(90);
		r2d2.move(250);
		r2d2.move(250);
		r2d2.penDown();
		r2d2.setPenColor(Color.GREEN);
		r2d2.turn(90);
		r2d2.move(250);
		r2d2.turn(90);
		r2d2.move(250);
		r2d2.penUp();
		r2d2.move(250);
	} 
}
