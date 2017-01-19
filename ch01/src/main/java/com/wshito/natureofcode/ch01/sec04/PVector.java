package com.wshito.natureofcode.ch01.sec04;

/**
 * Two dimensional vector class for Chap 1, Sec 4.
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
	
	/**
	 * Vector subtraction.
	 */
	public void sub (PVector v) {
		x = x - v.x;
		y = y - v.y;
	}
	
	/**
	 * Vector multiplication.
	 */
	public void mult (float n) {
		x = x * n;
		y = y * n;
	}
}
