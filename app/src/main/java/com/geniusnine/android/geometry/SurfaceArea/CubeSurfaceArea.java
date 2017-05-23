package com.geniusnine.android.geometry.SurfaceArea;

public class CubeSurfaceArea {
	
	
	public double calculateCubeSurfaceArea(double edgeLength){
		
		double result;
		result=6*Math.pow(edgeLength, 2);
		return result;
		
	}
	
	/*public static void main(String args[])
	{
		CubeSurfaceArea surfaceArea= new CubeSurfaceArea();
		
		double cubeSurfaceArea;

		cubeSurfaceArea=surfaceArea.calculateCubeSurfaceArea(10);
		System.out.print("\n Cube Surface Area is:"+cubeSurfaceArea+"\n");
	}*/
}
