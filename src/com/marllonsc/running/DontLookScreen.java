package com.marllonsc.running;

import java.time.LocalTime;

import com.marllonsc.robot.RobotActionKeyboard;

public class DontLookScreen {
	
	static RobotActionKeyboard robot = new RobotActionKeyboard();
	
	
public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();
		int minutos = 3;
		int milesegundos = 1000;
		int time = minutos*60*milesegundos;

        // Set the target time for 7:59:59 AM
        LocalTime targetTime = LocalTime.of(18,00,00);

        // Compare the current time with the target time
        while (!now.isAfter(targetTime)) {
            robot.pressKeyDown();
    		try {
				Thread.sleep(time);
				System.out.println(LocalTime.now().toString().substring(0,8) + " Running...");
				now = LocalTime.now();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

        } 
        
		
	}

}
