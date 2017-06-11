import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotHouses {
	
	public static void main(String[] args) {
	Robot house = new Robot();
	house.setWindowColor(Color.black);
	house.moveTo(-10, 550);
	house.setSpeed(15);
	house.turn(90);
	for (int i = 0; i < 10; i++) {
		
	
	house.setPenColor(Color.green);
	house.penDown();
	house.move(70);
	house.turn(-90);
	house.setPenColor(Color.blue);
	house.move(300);
	house.turn(90);
	house.move(70);
	house.turn(90);
	house.move(300);
	house.turn(-90);
	
	
	
	
	}
	
	
	
	
	
	
	
	
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
