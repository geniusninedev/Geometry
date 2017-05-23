package com.geniusnine.android.geometry.SurfaceArea;

public class SquarePyramid {

	public double calculateSquarePyramidBaseSurfaceArea(double baseEdge){
		
		double result;
		result=Math.pow(baseEdge, 2);
		return result;
		
		
	}
	
public double calculateSquarePyramidLateralSurfaceArea(double baseEdge,double height){
		
		double resultOne,finalResult;
		resultOne=Math.pow(baseEdge/2, 2)+Math.pow(height, 2);
		finalResult=2*baseEdge*Math.sqrt(resultOne);
		return finalResult;
		
		
	}

public double calculateSquarePyramidTotalSurfaceArea(double baseEdge,double height){
	
	double result,totalResult;
	result=Math.pow(baseEdge, 2);

	double resultOne,finalResult;
	resultOne=Math.pow(baseEdge/2, 2)+Math.pow(height, 2);
	finalResult=2*baseEdge*Math.sqrt(resultOne);
	totalResult=result+finalResult;
	return totalResult;
	
	
}
	public static void main(String args[])
	{
		SquarePyramid surfaceArea= new SquarePyramid();
		
		double squarePyramidSurfaceArea,squarePyramidLateralSurfaceArea,squarePyramidTotalSurfaceArea;
		
		squarePyramidSurfaceArea=surfaceArea.calculateSquarePyramidBaseSurfaceArea(10);
		System.out.print("\n Square Pyramid Base Surface Area is:"+squarePyramidSurfaceArea+"\n");
		
		squarePyramidLateralSurfaceArea=surfaceArea.calculateSquarePyramidLateralSurfaceArea(10,20);
		System.out.print("\n Square Pyramid Lateral Surface Area is:"+squarePyramidLateralSurfaceArea+"\n");
		
		
		squarePyramidTotalSurfaceArea=surfaceArea.calculateSquarePyramidTotalSurfaceArea(10,20);
		System.out.print("\n Square Pyramid Total Surface Area is:"+squarePyramidTotalSurfaceArea+"\n");
		
	}
}

