package com.geniusnine.android.geometry.SurfaceArea;

public class BallSurface {


	
	
	
	public double calculateSurfaceAreaOfBall(double radius){
		
		double result;
		result=4*3.14159265358979323*Math.pow(radius, 2);
		return result;
		
	}

	
	public static void main(String args[])
	{
		BallSurface surfaceArea= new BallSurface();
		
		double areaOfBall;

		areaOfBall=surfaceArea.calculateSurfaceAreaOfBall(10);
		System.out.print("\n Radius From Diameter is:"+areaOfBall+"\n");
	}
}
