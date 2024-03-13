package com.marllonsc.running;

import java.time.LocalTime;

import com.marllonsc.robot.RobotActionKeyboard;

public class RegistryInAndLeaveWork {
	
	static RobotActionKeyboard robot = new RobotActionKeyboard();

	
	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();

        // Set the target time for 7:59:59 AM
        LocalTime targetTime = LocalTime.of(8,9 , 59);

        // Compare the current time with the target time
        while (!now.isAfter(targetTime)) {
            robot.pressKeyDown();
    		try {
				Thread.sleep(800);
				System.out.println("Running...");
				System.out.println("date Now "+ now);
				now = LocalTime.now();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        } 
        
        try {
			robot.altTab();
			Thread.sleep(500);
			robot.contolV();
			Thread.sleep(500);
			robot.pressEnter();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
	}

}
