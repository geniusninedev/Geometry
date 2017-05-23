package com.geniusnine.android.geometry.SurfaceArea;

public class CapSurface {
	public double calculateCapSurfaceArea(double ballRadius,double height){
		double result;
		result=2*3.14159265358979323*height*ballRadius;
		return result;
		
	}
	
	public double calculateCapBallTotalSurfaceArea(double baseRadius,double ballRadius,double height){
		double result;
		result=2*3.14159265358979323*height*ballRadius;
		return result;
		
	}
/*public double calculateCapSurfaceArea(double ballRadius,double height){
		double result;
		result=2*3.14159265358979323*height*ballRadius;
		return result;
		
	}*/
	
	public double calculateCapBaseSurfaceArea(double baseRadius,double ballRadius,double height){
		double result;
		result=3.14159265358979323*Math.pow(baseRadius, 2);
		return result;
		
	}
	
	
	public double calculateCapTotalSurfaceArea(double baseRadius,double ballRadius,double height){
		double resultOne,resultTwo,result;
		
	/*	resultOne=2*3.14159265358979323*height*ballRadius;
		resultTwo=3.14159265358979323*height*Math.pow(baseRadius, 2);

		2πhR + πhr2*/
		result=2*3.14159265358979323*height*ballRadius+3.14159265358979323*Math.pow(baseRadius, 2);
		return result;
		
	}

	
	/*public static void main(String args[])
	{
		CapSurface surfaceArea= new CapSurface();
		
		double capSurfaceArea,capBaseSurfaceArea,capTotalSurfaceArea,capBallTotalSurfaceArea;
	
		
		capBaseSurfaceArea=surfaceArea.calculateCapBaseSurfaceArea(10,20);
		System.out.print("\n Cap Base Surface Area is:"+capBaseSurfaceArea+"\n");

		
		capTotalSurfaceArea=surfaceArea.calculateCapTotalSurfaceArea(10,10,20);
		System.out.print("\n Cap Total Surface Area is:"+capTotalSurfaceArea+"\n");
		
		capSurfaceArea=surfaceArea.calculateCapSurfaceArea(10,20);
		System.out.print("\n Cap Surface Area is:"+capSurfaceArea+"\n");
		
		capBallTotalSurfaceArea=surfaceArea.calculateCapBallTotalSurfaceArea(10,20);
		System.out.print("\n Cap Ball Total Surface Area is:"+capBallTotalSurfaceArea+"\n");
	}
	*/
	
/*	public static void main(String args[])
	{
		CapSurface surfaceArea= new CapSurface();
		
		double capSurfaceArea,capBallTotalSurfaceArea,capBaseSurfaceArea,capTotalSurfaceArea;
		
		capSurfaceArea=surfaceArea.calculateCapSurfaceArea(10,20);
		System.out.print("\n Cap Surface Area is:"+capSurfaceArea+"\n");
		
		capBallTotalSurfaceArea=surfaceArea.calculateCapBallTotalSurfaceArea(10,20);
		System.out.print("\n Cap Ball Total Surface Area is:"+capBallTotalSurfaceArea+"\n");
	}*/
}
