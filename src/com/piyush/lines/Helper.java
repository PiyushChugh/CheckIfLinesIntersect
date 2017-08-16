package com.piyush.lines;

public class Helper {	

	/**
	 * This simple method takes all 4 coordinates and returns true if those lines *may* intersect at some point
	 * else it returns false
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @param x4
	 * @param y4
	 * @return
	 */
	public boolean checkIfLineIntersects(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4) {
		double one = x2-x1;
		double two = y2-y1;
		double three = x4-x3;
		double four = y4-y3;
		
		if(one<0) {
			one = one*(-1);
		}
		if(two<0) {
			two = two*(-1);
		}
		if(three<0) {
			three = three*(-1);
		}
		if(four<0) {
			four = four*(-1);
		}
		
		if(one == 0 || three == 0) {
			throw new ArithmeticException("\nOops, looks like you're trying to divide by 0. Please try again.");
		}
		
		double slope1 = two/one; // Slope of line 1
		double slope2 = four/three; // Slope of line 2
		
		if(slope1 != slope2) {
			return true;
		} else {
			return false;
		}
	}
}
