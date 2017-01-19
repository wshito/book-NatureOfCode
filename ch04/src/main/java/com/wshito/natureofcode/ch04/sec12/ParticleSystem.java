package com.wshito.natureofcode.ch04.sec12;

import java.util.ArrayList;
import java.util.Iterator;

import com.wshito.natureofcode.ch04.sec11.Particle;

import processing.core.PApplet;
import processing.core.PVector;

/**
 * The class of particle system that uses repeller. 
 *
 * @author Wataru Shito (http://www.wshito.com)
 */
public class ParticleSystem {
	
	private PApplet _app;
	private ArrayList<Particle> _particles = new ArrayList<Particle>();
	private PVector _origin = new PVector();
	
	public ParticleSystem (PVector location, PApplet applet) {
		_app = applet;         // need this for Particle instances to draw themselves.
		_origin.set(location); // copy the coordinates
	}
	
	/**
	 * Adds new particle at the origin.
	 */
	public void addParticle () {
		_particles.add(new Particle(_origin, _app)); // Particle copies the given vector.
	}
	
	/**
	 * Applies the given force.
	 */
	public void applyForce (PVector force) {
		for (Particle p : _particles) {
			p.applyForce(force);
		}
	}
	
	/**
	 * Calculates the force based on the repeller and applies it on particles. 
	 */
	public void applyRepeller (Repeller r) {
		PVector force;
		for (Particle p : _particles) {
	
			force = r.repel(p);
			p.applyForce(force);
		}
	}
	
	public void run () {
		Iterator<Particle> it = _particles.iterator();
		Particle p;
		while (it.hasNext()) {
			p = it.next();
			p.run();
			if (p.isDead())
				it.remove();
		}
	}
	
}
