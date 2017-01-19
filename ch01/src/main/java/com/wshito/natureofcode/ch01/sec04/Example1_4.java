package com.wshito.natureofcode.ch01.sec04;

import processing.core.PApplet; // do not use * to avoid importing PVector.

/**
 * Draws a shrunk line between the center of the screen and mouse location.
 *
 * @author wshito (http://www.wshito.com)
 */
public class Example1_4 extends PApplet {

    public void settings(){
        size (640, 360);
    }
 
    public void setup() {
    	background(255);
    }
 
    public void draw() {
    	background(255);
    	
    	PVector mouse = new PVector ((float)this.mouseX, (float)this.mouseY);
    	PVector center = new PVector (this.width/2.0f, this.height/2.0f);
    	
    	mouse.sub(center);  // this vector now points the mouse from the center.
    	mouse.mult(0.5f);   // now the length is half. 
    	
    	this.translate(this.width/2.0f, this.height/2.0f); // set the center of the screen as the origin.
    	this.line(0, 0, mouse.x, mouse.y);
    }
    
    public static void main(String[] args) {
    	PApplet.main( "com.wshito.natureofcode.ch01.sec04.Example1_4" );
    }
}
