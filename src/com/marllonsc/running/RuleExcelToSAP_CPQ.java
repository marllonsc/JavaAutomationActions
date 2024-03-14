package com.marllonsc.running;

import java.awt.Robot;
import java.awt.event.KeyEvent;


import com.marllonsc.robot.RobotActionKeyboard;

public class RuleExcelToSAP_CPQ {
	
	static // Create a Robot object to control keyboard and mouse
	RobotActionKeyboard robot = new RobotActionKeyboard();

	public static void main(String[] args) {
		try {
			
			beginning();
			
			for (int i = 1; i <= 20; i++) {
				processRulers();
			}
			
			System.out.println("Finished !!!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void processRulers() throws InterruptedException {
		movingLineRigut();
		
		
		robot.pressKeyTAB();
		Thread.sleep(500);
		robot.controlShiftV();
		Thread.sleep(500);
		
		
		movingLineRigut();
		
		
		for (int i = 1; i <= 7; i++) {
			robot.pressKeyTAB();
			Thread.sleep(500);
		}
		
		robot.controlShiftV();
		Thread.sleep(500);
		
		
		movingLineRigut();
		
		for (int i = 1; i <= 2; i++) {
			robot.pressKeyTAB();
			Thread.sleep(500);
		}
		
		robot.controlShiftV();
		Thread.sleep(500);
		
		
		movingLineRigut();
		robot.altTab();
		Thread.sleep(500);
		robot.altTab();
		Thread.sleep(500);
		movingLineRigut();
		
		for (int i = 1; i <= 30; i++) {
			robot.pressKeyTAB();
			Thread.sleep(500);
		}
		
		robot.controlShiftV();
		Thread.sleep(500);
		
		for (int i = 1; i <= 5; i++) {
			robot.pressKeyTAB();
			Thread.sleep(500);
		}
		
		
		robot.pressEnter();
		Thread.sleep(1000);
		
		for (int i = 1; i <= 10; i++) {
			robot.pressKeyTAB();
			Thread.sleep(500);
		}
		
		
		robot.pressEnter();
		Thread.sleep(500);
		
		robot.pressKeyTAB();
		robot.pressEnter();
		Thread.sleep(500);
		
		startAgaim();
	}

	

	private static void movingLineRigut() throws InterruptedException {
		robot.altTab();
		Thread.sleep(500);
		robot.pressKeyRight();
		Thread.sleep(500);
		robot.contolC();
		Thread.sleep(500);
		robot.altTab();
		Thread.sleep(500);
	}
	
	
	private static void AltTabTwoTimes(Robot robot) throws InterruptedException {
		// Simulate pressing Alt+Tab simultaneously
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_TAB);

		// Delay a short moment to simulate simultaneous pressing
		Thread.sleep(100); // Adjust the delay as needed

		// Release Tab while keeping Alt pressed
		robot.keyRelease(KeyEvent.VK_TAB);

		// Simulate pressing Tab while keeping Alt pressed
		robot.keyPress(KeyEvent.VK_TAB);

		// Delay a short moment to simulate pressing Tab while keeping Alt pressed
		Thread.sleep(100); // Adjust the delay as needed

		// Release Alt
		robot.keyRelease(KeyEvent.VK_ALT);
	}

	private static void beginning() throws InterruptedException {
		robot.altTab();

		Thread.sleep(500);

		robot.contolC();

		Thread.sleep(500);

		AltTabTwoTimes(robot.getRobot());

		Thread.sleep(500);

		robot.pressKeyTAB();

		Thread.sleep(500);

		robot.pressKeyTAB();

		Thread.sleep(500);

		robot.pressKeyTAB();

		Thread.sleep(500);

		robot.pressKeyTAB();

		Thread.sleep(500);

		robot.pressEnter();

		Thread.sleep(500);

		robot.pressKeyTAB();

		Thread.sleep(500);

		robot.controlShiftV();

		Thread.sleep(500);
	}
	
	
	
	private static void startAgaim() throws InterruptedException {
		
		robot.altTab();
		
		for (int i = 1; i <= 6; i++) {
			robot.pressKeyleft();
			Thread.sleep(500);
		}
		
		robot.pressKeyDown();
		Thread.sleep(500);
		

		robot.contolC();

		Thread.sleep(500);

		robot.altTab();

		Thread.sleep(500);

		robot.pressKeyTAB();

		Thread.sleep(500);

		robot.pressKeyTAB();

		Thread.sleep(500);

		robot.pressKeyTAB();

		Thread.sleep(500);

		robot.pressKeyTAB();

		Thread.sleep(500);

		robot.pressEnter();

		Thread.sleep(500);

		robot.pressKeyTAB();

		Thread.sleep(500);

		robot.controlShiftV();

		Thread.sleep(500);
	}


	
}
