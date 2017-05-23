package com.geniusnine.android.geometry.SurfaceArea;

public class ConicalFrustumSurface {

	
	public  double calculateConicalFrustumEndsSurfaceArea (double topRadius,double bottomRadius,double height ){
		
		double resultEnds;
		resultEnds=3.14159265358979323*((Math.pow(topRadius, 2)+Math.pow(bottomRadius, 2)));
		return resultEnds;
		
	}
	
	
	
public  double calculateConicalFrustumLateralSurfaceArea (double topRadius,double bottomRadius,double height ){
		
		double resultOne,resultTwo,resultThree,resultLateral;
		resultOne=3.14159265358979323*(topRadius+bottomRadius);
		resultThree=(topRadius-bottomRadius);
		resultTwo=Math.pow(resultThree, 2)+Math.pow(height, 2);
		resultLateral=resultOne*Math.sqrt(resultTwo);
		return resultLateral;
		
	}


public  double calculateConicalFrustumTotalSurfaceArea (double topRadius,double bottomRadius,double height ){

	double resultEnds,result;
	double resultOne,resultTwo,resultThree,resultLateral;
	resultOne=3.14159265358979323*(topRadius+bottomRadius);
	resultThree=(topRadius-bottomRadius);
	resultTwo=Math.pow(resultThree, 2)+Math.pow(height, 2);
	resultLateral=resultOne*Math.sqrt(resultTwo);
	resultEnds=3.14159265358979323*(Math.pow(topRadius, 2)+Math.pow(bottomRadius, 2));
	result=resultEnds+resultLateral;
	return result;
	
}

	public static void main(String args[])
	{
		ConicalFrustumSurface surfaceArea= new ConicalFrustumSurface();
		
		double conicalFrustumSurfaceArea,conicalFrustumLateralSurfaceArea,conicalFrustumTotalSurfaceArea;
		
		conicalFrustumSurfaceArea=surfaceArea.calculateConicalFrustumEndsSurfaceArea(10,20,30);
		System.out.print("\n Conical Frustum Surface Area is:"+conicalFrustumSurfaceArea+"\n");
		
	
		conicalFrustumLateralSurfaceArea=surfaceArea.calculateConicalFrustumLateralSurfaceArea(10,20,30);
		System.out.print("\n Conical Frustum Lateral Surface Area is:"+conicalFrustumLateralSurfaceArea+"\n");
		

		conicalFrustumTotalSurfaceArea=surfaceArea.calculateConicalFrustumTotalSurfaceArea(10,20,30);
		System.out.print("\n Conical Frustum Total Surface Area is:"+conicalFrustumTotalSurfaceArea+"\n");
	}
}
