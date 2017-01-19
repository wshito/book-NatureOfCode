package com.wshito.natureofcode.ch04.sec12;

import processing.core.PApplet;
import processing.core.PVector;

/**
 * @author Wataru Shito (http://www.wshito.com)
 */
public class Example4_7 extends PApplet {
	
	private ParticleSystem _particleSystem;
	private Repeller _repeller;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PApplet.main ("com.wshito.natureofcode.ch04.sec12.Example4_7");
	}
	
	public void settings () {
		size (640, 360);
	}
	
	public void setup () {
		_particleSystem = new ParticleSystem(new PVector(width / 2f, 50f), this);
		_repeller = new Repeller (width/2f - 20f, height/2f, this);
	}
	
	public void draw () {
		background (100);
		_particleSystem.addParticle();
		PVector gravity = new PVector (0f, 0.1f);
		_particleSystem.applyForce(gravity);
		_particleSystem.applyRepeller(_repeller);
		
		_particleSystem.run();
		_repeller.display();
	}

}
