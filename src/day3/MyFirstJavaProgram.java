package day3;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		Robot c3po = new Robot();
		c3po.penDown();
		c3po.setSpeed(10);
		for (int i = 0; i < 8; i++) {
			c3po.setPenColor(2550, i, i);
			c3po.move(150);
			c3po.turn(360 / 8);

		}

	}

}
