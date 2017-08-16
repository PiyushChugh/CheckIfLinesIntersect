package com.piyush.lines;

import java.util.Scanner;
/**
 * This class uses a simple formula to tell if two lines represented in cartesian coordinates will intersect or not.
 * If the slopes of both lines are equal, it means they're parallel and won't ever intersect.
 * However, if they aren't equal, they'll intersect somewhere on the cartesian plane.
 * Right now we just find if they intersect or not, this program can be further enhanced to calculate that exact point where they'll intersect. 
 * @author Piyush Chugh
 *
 */
public class CheckIfLinesIntersect {

	public static void main(String[] args) {
		
		System.out.println("\nHello "+System.getProperty("user.name")+",\n");
		System.out.println("Please enter the cartesian coordinates of line 1 (x1,y1) and (x2,y2):");
		Scanner sc = new Scanner(System.in);
		System.out.print("x1=");
		int x1 = sc.nextInt();
		System.out.print("y1=");
		int y1 = sc.nextInt();
		System.out.print("x2=");
		int x2 = sc.nextInt();
		System.out.print("y2=");
		int y2 = sc.nextInt();
		System.out.println("\nPlease enter the cartesian coordinates of line 2 (x3,y3) and (x4,y4):");
		System.out.print("x3=");
		int x3 = sc.nextInt();
		System.out.print("y3=");
		int y3 = sc.nextInt();
		System.out.print("x4=");
		int x4 = sc.nextInt();
		System.out.print("y4=");
		int y4 = sc.nextInt();
		sc.close();
		
		try {
				if(new Helper().checkIfLineIntersects(x1,y1,x2,y2,x3,y3,x4,y4)) {
				System.out.println("\nLines Intersect");
			} else {
				System.out.println("\nLines Do Not Intersect");
			}
		} catch (ArithmeticException e) {
			System.out.println("\nOops, looks like you're trying to divide by 0. Please try again.");
		}
	}
	
}
