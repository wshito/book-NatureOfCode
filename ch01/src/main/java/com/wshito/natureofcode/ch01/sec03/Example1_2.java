package com.wshito.natureofcode.ch01.sec03;

import processing.core.PApplet; // do not use * to avoid importing PVector.

/**
 *
 * @author wshito (http://www.wshito.com)
 */
public class Example1_2 extends PApplet {

	// private float x = 100;
	// private float y = 100;
	// private float xspeed = 1;
	// private float yspeed = 3.3f;
	private PVector location;
	private PVector velocity;
	
    public void settings(){
        size (640, 360);
    }
 
    public void setup() {
    	background(255);
    	location = new PVector (100, 100);
    	velocity = new PVector (2.5f, 5f);
    }
 
    public void draw() {
    	background(255);
    	
    	// x = x + xspeed;
    	// y = y + yspeed;
    	location.add(velocity);
    	
    	if ((location.x > width) || (location.x < 0)) {
    		velocity.x = velocity.x * -1;   // xspeed = xspeed * -1;
    	}
    	if ((location.y > height) || (location.y < 0)) {
    		velocity.y = velocity.y * -1;   // yspeed = yspeed * -1;
    	}
    	
    	stroke(0);
    	fill(175);
    	// ellipse (x, y, 16, 16);
    	ellipse (location.x, location.y, 16, 16);
    }
    
    public static void main(String[] args) {
    	PApplet.main( "com.wshito.natureofcode.ch01.sec03.Example1_2" );
    }
}
