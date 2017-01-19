package com.wshito.natureofcode.ch04.sec12;

import com.wshito.natureofcode.ch04.sec11.Particle;

import processing.core.PApplet;
import processing.core.PVector;

/**
 *
 * @author Wataru Shito (http://www.wshito.com)
 */
public class Repeller {

	private PApplet _app;
	private PVector _location;
	private float _radius = 10;
	/** The magnitude of repeller. */
	private float _strength = 100;
	
	public Repeller (float x, float y, PApplet applet) {
		_app = applet;
		_location = new PVector (x, y);
	}
	
	public void display () {
		_app.stroke(255);
		_app.fill(255);
		_app.ellipse(_location.x, _location.y, _radius*2, _radius*2);
	}
	
	/**
	 * @param p
	 * @return
	 */
	public PVector repel (Particle p) {
		PVector direction = PVector.sub(_location, p.location);
		float d = direction.mag();
		direction.normalize();
		d = PApplet.constrain(d, 5f, 100f);
		float force = -1f * _strength / (d * d);
		direction.mult(force);
		return direction;
	}

}
