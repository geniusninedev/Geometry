package com.geniusnine.android.geometry.SurfaceArea;

public class ConeSurface {

	
	public double calculateBaseSurfaceArea(double baseRadius){
		
		double resultBaseSurfaceArea;
		resultBaseSurfaceArea=3.14159265358979323*Math.pow(baseRadius, 2);
		return resultBaseSurfaceArea;
		
	}
	
	
	public double calculateLateralSurfaceArea(double baseRadius,double height){
		
		double LateralSurfaceArea;
		double radiusHeightResult;
		
		radiusHeightResult=Math.pow(baseRadius, 2)+Math.pow(height, 2);
		LateralSurfaceArea=3.14159265358979323*baseRadius*Math.sqrt(radiusHeightResult);
		
		return LateralSurfaceArea;
		
	}

			
	public double calculateTotalSurfaceArea(double baseRadius,double height){
		
		double TotalSurfaceArea;
		double radiusHeightResult,resultOne,resultTwo;
		
		radiusHeightResult=Math.pow(baseRadius, 2)+Math.pow(height, 2);
		resultOne=Math.sqrt(radiusHeightResult);
		resultTwo=baseRadius+resultOne;
		
		TotalSurfaceArea=3.14159265358979323*baseRadius*resultTwo;
		return TotalSurfaceArea;
		
	}	
	public static void main(String args[])
	{
		ConeSurface surfaceArea= new ConeSurface();
		
		double coneBaseSurfaceArea,coneLateralSurfaceArea,coneTotalSurfaceArea;

		coneBaseSurfaceArea=surfaceArea.calculateBaseSurfaceArea(10);
		System.out.print("\n Base Surface Area is:"+coneBaseSurfaceArea+"\n");
		

		coneLateralSurfaceArea=surfaceArea.calculateLateralSurfaceArea(10,10);
		System.out.print("\n Lateral Surface Area is:"+coneLateralSurfaceArea+"\n");
		

		coneTotalSurfaceArea=surfaceArea.calculateTotalSurfaceArea(10,10);
		System.out.print("\n Total Surface Area is:"+coneTotalSurfaceArea+"\n");
	}
} 
