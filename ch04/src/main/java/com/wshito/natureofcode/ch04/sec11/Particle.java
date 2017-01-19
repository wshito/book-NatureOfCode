package com.wshito.natureofcode.ch04.sec11;

import processing.core.PApplet;
import processing.core.PVector;

/**
 * The Particle class.
 * 
 * @author Wataru Shito (http://www.wshito.com)
 */
public class Particle {
	
	private PApplet _app;
	private PVector _velocity;
	private PVector _acceleration;
	private float   _lifespan;
	private float   _mass = 1;
	
	public PVector location = new PVector();
	
	public Particle (PVector l, PApplet applet) {
		_app = applet;
		_acceleration = new PVector (0, 0);   // start from zero acceleration
		_velocity = new PVector (_app.random(-1f, 1f), _app.random(-2f, 0f));
		location.set(l);  // copies the cordinates
		_lifespan = 255.0f;
	}
	
	public void run () {
		_update ();
		_display ();
	}
	
	/** The Newton's 2nd law  */
	public void applyForce (PVector force) {
		PVector f = new PVector();
		f.set (force); // copies the coordinates
		f.div (_mass);
		_acceleration.add (f);
	}
	
	public boolean isDead () {
		return (_lifespan < 0.0);
	}
	
	private void _update () {
		_velocity.add(_acceleration);
		location.add(_velocity);
		_acceleration.mult(0);
		_lifespan -= 2.0f;
	}
	
	private void _display () {
		_app.stroke(255, _lifespan);
		_app.fill(255, _lifespan);
		_app.ellipse(location.x, location.y, 8f, 8f); // particle is a circle
	}
}
