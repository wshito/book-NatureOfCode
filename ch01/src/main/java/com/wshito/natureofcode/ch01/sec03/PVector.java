package com.wshito.natureofcode.ch01.sec03;

/**
 * Two dimensional vector class.
 *
 * @author wshito (http://www.wshito.com)
 */
public class PVector {
	
	public float x;
	public float y;
	
	/**
	 * Constructor.
	 */
	public PVector (float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Vector addition.
	 */
	public void add (PVector v) {
		y = y + v.y;
		x = x + v.x;
	}
}
