package com.wshito.natureofcode.ch00.sec02;

import processing.core.PApplet;

/**
 *
 * @author Wataru Shito (http://www.wshito.com)
 */
public class Walker {

	private PApplet app;
	private int x;
	private int y;
	
	public Walker (PApplet applet) {
		app = applet;
		x = app.width / 2;
		y = app.height / 2;
	}
	
	public void step () {
		int choice = (int)app.random(4.0f);
		
		if (choice == 0) {
			x++;
		} else if (choice == 1) {
			x--;
		} else if (choice == 2) {
			y++;
		} else {
			y--;
		}
	}
	
	public void display () {
		app.stroke (0);
		app.point(x, y);
	}
	
}
