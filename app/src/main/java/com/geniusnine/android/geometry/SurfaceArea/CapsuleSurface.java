package com.geniusnine.android.geometry.SurfaceArea;

public class CapsuleSurface {
double baseRadius, baseheight;
	
	public double calculateEndSurfaceArea(double baseRadius){
		

		double result;
		result=4*3.14159265358979323*Math.pow(baseRadius, 2);
		return result;
		
	}
	
	
public double calculateLateralSurfaceArea(double baseRadius,double height){
		
	
		double result;
		result=2*3.14159265358979323*baseRadius*height;
		return result;
		
	}
    public double calculateTotalSurfaceArea(double baseRadius,double baseheight){


        double result;
        result=4*3.14159265358979323*Math.pow(baseRadius, 2)+2*3.14159265358979323*baseRadius*baseheight;;
        return result;

    }



	public static void main(String args[])
	{
		CapsuleSurface surfaceArea= new CapsuleSurface();
		
		double capsuleEndSurfaceArea,capsuleLateralSurfaceArea,capsuleTotalSurfaceArea;
		
		capsuleEndSurfaceArea=surfaceArea.calculateEndSurfaceArea(10);
		System.out.print("\n Capsule End  Surface Area is:"+capsuleEndSurfaceArea+"\n");
		
		capsuleLateralSurfaceArea=surfaceArea.calculateLateralSurfaceArea(15,20);
		System.out.print("\n Capsule Lateral Surface Area is:"+capsuleLateralSurfaceArea+"\n");
		
		capsuleTotalSurfaceArea=surfaceArea.calculateTotalSurfaceArea(15,20);
		System.out.print("\n Capsule Total Surface Area is:"+capsuleTotalSurfaceArea+"\n");
	}
}
