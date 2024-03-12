package com.marllonsc.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotActionKeyboard {
	
	protected static Robot robot;
	
	public RobotActionKeyboard() {
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public  void pressEnter() {
		// Simulate pressing and releasing the Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void pressKeyTAB() {
		// Simulate pressing and releasing the Tab key
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	public  void contolC() throws InterruptedException {
		// Simulate pressing Ctrl+C simultaneously
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);

		// Delay a short moment to simulate simultaneous pressing
		Thread.sleep(100); // Adjust the delay as needed

		// Release Ctrl+C simultaneously
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	public  void contolV() throws InterruptedException {
		// Simulate pressing Ctrl+C simultaneously
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Delay a short moment to simulate simultaneous pressing
		Thread.sleep(100); // Adjust the delay as needed

		// Release Ctrl+C simultaneously
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	public void pressKeyRight() {
		// Simulate pressing and releasing the right arrow key
		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
	}
	
	public  void pressKeyleft() {
		// Simulate pressing and releasing the right arrow key
		robot.keyPress(KeyEvent.VK_LEFT);
		robot.keyRelease(KeyEvent.VK_LEFT);
	}
	
	public  void pressKeyDown() {
		// Simulate pressing and releasing the right arrow key
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}

	public  void altTab() throws InterruptedException {
		// Simulate pressing Alt+Tab simultaneously
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_TAB);

		// Delay a short moment to simulate simultaneous pressing
		Thread.sleep(100); // Adjust the delay as needed

		// Release Alt+Tab simultaneously
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ALT);
	}
	
	public void controlShiftV() throws InterruptedException {
		// Simulate pressing Ctrl+Shift+V simultaneously
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_V);

		// Delay a short moment to simulate simultaneous pressing
		Thread.sleep(100); // Adjust the delay as needed

		// Release Ctrl+Shift+V simultaneously
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	public Robot getRobot() {
		return robot;
	}}
