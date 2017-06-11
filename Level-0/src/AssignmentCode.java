package Assignments;

import java.io.IOException;

import org.jointheleague.ecolban.rpirobot.IRobotAdapter;
import org.jointheleague.ecolban.rpirobot.IRobotInterface;
import org.jointheleague.ecolban.rpirobot.SimpleIRobot;

public class AssignmentCode extends IRobotAdapter {
	Sonar sonar = new Sonar();
	
	public AssignmentCode(IRobotInterface iRobot) {
		super(iRobot);
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Try event listner, rev Monday 2030");
		IRobotInterface base = new SimpleIRobot();
		AssignmentCode rob = new AssignmentCode(base);
		rob.setup();
		while(rob.loop()){}
		rob.shutDown();
		
	}

	
	
	private void setup() throws Exception {
		//SETUP CODE GOES HERE!!!!!
		
		
		
			
		
	}
	
	private boolean loop() throws Exception{
		readSensors(100);
		int[] lightBumpReadings = getLightBumps();
		
		driveDirect(150, 90);
		
		if(lightBumpReadings[0] > 0){
			driveDirect(200, -200);
			sleep(500);
			
		}else if(lightBumpReadings[1] > 0){
			driveDirect(200, -200);
			sleep(500);
	
		}else if(lightBumpReadings[2] > 0){
			driveDirect(-200, -200);
			sleep(500);
		}
			else	if(lightBumpReadings[3] > 0){
		driveDirect(-200, 0);
		sleep(500);
		
	}else if(lightBumpReadings[4] > 0){
		driveDirect(-200, 200);
		sleep(500);
		
	}else if(lightBumpReadings[5] > 0){
		driveDirect(-200, 200);
		sleep(500);
				
		
		//LOOP CODE GOES HERE!!!!!
		
		}
		
		if(isBumpLeft() || isBumpRight()){
			driveDirect(-100, -100);
			sleep(500);
			driveDirect(-500, 500);
			sleep(3000);
			driveDirect(0, 0);
			
			return false;
		}
		
		else{return true;}
		}
		
	
	
	private void sleep(int amt){
		try {
			Thread.sleep(amt);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void shutDown() throws IOException {
		reset();
		stop();
		closeConnection();
	}
}