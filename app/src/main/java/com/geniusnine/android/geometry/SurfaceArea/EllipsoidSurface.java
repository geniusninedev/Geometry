package com.geniusnine.android.geometry.SurfaceArea;

public class EllipsoidSurface {

	public double calculateEllipsoidSurface(double axisOne,double axisTwo,double axisThree){
		
		double resultOne,result1,resultTwo,result2,resultThree,result3,resultValueOne,result;
		
		resultOne=axisOne*axisTwo;
		result1=Math.pow(resultOne, 1.6);
		resultTwo=axisOne*axisThree;
		result2=Math.pow(resultTwo, 1.6);
		resultThree=axisTwo*axisThree;
		result3=Math.pow(resultThree, 1.6);
		
		resultValueOne=(result1+result2+result3)/3;
		result=4*3.14159265358979323*Math.pow(resultValueOne, 0.625);
		return result;
		
	}
	
	public static void main(String args[])
	{
		EllipsoidSurface surfaceArea= new EllipsoidSurface();
		
		double ellipsoidSurfaceArea;
		ellipsoidSurfaceArea=surfaceArea.calculateEllipsoidSurface(10,20,30);
		System.out.print("\n Ellipsoid Surface Area is:"+ellipsoidSurfaceArea+"\n");
		
	}
}
