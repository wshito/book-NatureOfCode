package com.wshito.natureofcode.ch01.sec01;

import processing.core.*;

/**
 *
 * @author wshito (http://www.wshito.com)
 */
public class Example1_1 extends PApplet {

	private float x = 100;
	private float y = 100;
	private float xspeed = 1;
	private float yspeed = 3.3f;
	
    public void settings(){
        size (640, 360);
    }
 
    public void setup() {
    	background(255);
    }
 
    public void draw() {
    	background(255);
    	
    	x = x + xspeed;
    	y = y + yspeed;
    	
    	if ((x > width) || (x < 0)) {
    		xspeed = xspeed * -1;
    	}
    	if ((y > height) || (y < 0)) {
    		yspeed = yspeed * -1;
    	}
    	
    	stroke(0);
    	fill(175);
    	ellipse (x, y, 16, 16);
    }
    
    public static void main(String[] args) {
    	PApplet.main( "com.wshito.natureofcode.ch01.sec01.Example1_1" );
    }
}
