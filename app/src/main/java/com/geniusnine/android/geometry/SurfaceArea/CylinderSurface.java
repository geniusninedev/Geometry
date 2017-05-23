package com.geniusnine.android.geometry.SurfaceArea;

public class CylinderSurface {

	
	public double calculateCylinderBaseSurfaceArea(double baseRadius){
		
		double result;
		result=2*3.14159265358979323*Math.pow(baseRadius, 2);
		return result;
		
	}
	
public double calculateCylinderLateralSurfaceArea(double baseRadius,double height){
		
		double result;
		result=2*3.14159265358979323*baseRadius*height;
		return result;
		

	}
public double calculateCylinderTotalSurfaceArea(double baseRadius,double height){
	
	double result;
	result=2*3.14159265358979323*baseRadius*(baseRadius+height);
	return result;
	

}

			
	public static void main(String args[])
	{
		CylinderSurface surfaceArea= new CylinderSurface();
		
		double cylinderBaseSurfaceArea,cylinderLateralSurfaceArea,cylinderTotalSurfaceArea;

		cylinderBaseSurfaceArea=surfaceArea.calculateCylinderBaseSurfaceArea(10);
		System.out.print("\n Cylinder Base Surface Area is:"+cylinderBaseSurfaceArea+"\n");

		cylinderLateralSurfaceArea=surfaceArea.calculateCylinderLateralSurfaceArea(10,20);
		System.out.print("\n Cylinder Lateral Surface Area is:"+cylinderLateralSurfaceArea+"\n");
		

		cylinderTotalSurfaceArea=surfaceArea.calculateCylinderTotalSurfaceArea(10,20);
		System.out.print("\n Cylinder Total Surface Area is:"+cylinderTotalSurfaceArea+"\n");
	}		
			
}
