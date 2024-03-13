package com.marllonsc.running;

import java.time.LocalTime;

import com.marllonsc.robot.RobotActionKeyboard;

public class DontLookScreen {
	
	static RobotActionKeyboard robot = new RobotActionKeyboard();
	
	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();

        // Set the target time for 7:59:59 AM
        LocalTime targetTime = LocalTime.of(17,59,59);

        // Compare the current time with the target time
        while (!now.isAfter(targetTime)) {
            robot.pressKeyDown();
    		try {
				Thread.sleep(800);
				System.out.println("Running...");
				now = LocalTime.now();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

        } 
        
		
	}

}
