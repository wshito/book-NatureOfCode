package com.wshito.natureofcode.ch00.sec02;

import processing.core.PApplet;

/**
 *
 * @author Wataru Shito (http://www.wshito.com)
 */
public class ExampleI_1 extends PApplet {

	private Walker w; 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
    	PApplet.main( "com.wshito.natureofcode.ch00.sec02.ExampleI_1" );
	}
	
	public void settings () {
		size (640, 360);
	}
	
	public void setup () {
		w = new Walker (this);
		background(255);
	}
	
	public void draw () {
		w.step();
		w.display();
	}

}
