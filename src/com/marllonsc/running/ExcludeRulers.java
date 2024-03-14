package com.marllonsc.running;

import com.marllonsc.robot.RobotActionKeyboard;

public class ExcludeRulers {
	
	static RobotActionKeyboard robot = new RobotActionKeyboard();
	
	public static void main(String[] args) {
		
		try {
			robot.altTab();
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for (int i = 1; i <= 78; i++) {
			
			try {
				Thread.sleep(7000);
				robot.pressEnter();
				Thread.sleep(500);
				robot.pressKeyTAB();
				Thread.sleep(500);
				robot.pressEnter();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
