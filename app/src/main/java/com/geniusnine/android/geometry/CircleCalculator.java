package com.geniusnine.android.geometry;

public class CircleCalculator {


	 double radius,diameter,circumference,area;
		
	    
	 
	 
	 public double calculateRadiusFromDiamter(double diameter)
	 {
		 double result;
		 
		 
		 result=diameter/2;
		  return result;
		 
		 
	 }
	 public double calculateRadiusFromCircumference(double circumference)
	 {
		 double resultCircumference;
		 
		 
		 resultCircumference=circumference/6.28318;
		  return resultCircumference;
		 
		 
	 }
	 public double calculateRadiusFromArea(double area)
	 {
		 double resultOne;
		 
		 resultOne=area/3.14159265358979323;
		 
		double  resultRadius=Math.sqrt(resultOne);
		  return resultRadius;
		 
		 
	 }
	 
	 
	 
	 
	 public double calculateDiameterFromRadius(double radius)
	 {
		 double result;
		 
		 
		 result=2*radius;
		  return result;
		 
		 
	 }
	 public double calculateDiameterFromcircumference(double circumference)
	 {
		 double result;
		 
		 
		 result=circumference/3.14159265358979323;
		  return result;
		 
		 
	 }
	 public double calculateDiameterFromArea(double area)
	 {
		 double resultOne;
		 
		 resultOne=area/3.14159265358979323;
		 
		double  result=2*Math.sqrt(resultOne);
		  return result;
		 
		 
	 }
	 
	 
	 public double calculateCircumferenceFromRadius(double radius)
	 {
		 double result;
		 
		 
		 result=2*3.14159265358979323*radius;
		  return result;
		 
		 
	 }
	 public double calculateCircumferenceFromDiameter(double diameter)
	 {
		 double result;
		 
		 
		 result=3.14159265358979323*diameter;
		  return result;
		 
		 
	 }
	 public double calculateCircumferenceFromArea(double area)
	 {
		
       double resultOne;
		 
		 resultOne=area/3.14159265358979323;
		 
		double  resultRadius=Math.sqrt(resultOne);
		double  result=2*area/resultRadius;
		  return result;
		 
		 
	 }
	 
		
	 public double calculateAreaFromRadius(double radius)
	 {
		 double result;
		 
		 
		 result=3.14159265358979323*Math.pow(radius, 2);
		  return result;
		 
		 
	 }
	 public double calculateAreaFromDiameter(double diameter)
	 {
		 double result;
		 
		 
		 result=0.25*3.14159265358979323*Math.pow(diameter, 2);
		  return result;
		 
		 
	 }
	 public double calculateAreaFromCircumference(double circumference)
	 {
		
		 	double resultCircumference;
		 	resultCircumference=circumference/6.28318;
		 	double result=0.5*circumference*resultCircumference;
		  return result;
		 
		 
	 }
		public static void main(String args[])
		{
			CircleCalculator circle= new CircleCalculator();
			
			double radiusfromDiameter,radiusFromCircumference,radiusFromArea;
			double diameterfromRadius,diameterFromCircumference,diameterFromArea;
			double circumferencefromRadius,circumferenceFromRadius,circumferenceFromArea;
			double areafromRadius,areaFromDiameter,areaFromCircumference;
			
			radiusfromDiameter=circle.calculateRadiusFromDiamter(10);
			System.out.print("\n Radius From Diameter is:"+radiusfromDiameter+"\n");
			 
			 radiusFromCircumference=circle.calculateRadiusFromCircumference(10);
			 System.out.print("\n Radius From Circumference:"+radiusFromCircumference+"\n");
			 
			radiusFromArea=circle.calculateRadiusFromArea(10);
			System.out.print("\n Radius From Area:"+radiusFromArea+"\n");
			 
			
			
			diameterfromRadius=circle.calculateDiameterFromRadius(10);
			System.out.print("\n Diameter From Radius:"+diameterfromRadius+"\n");
			 
			diameterFromCircumference=circle.calculateDiameterFromcircumference(10);
			System.out.print("\n Diameter From Circumference:"+diameterFromCircumference+"\n");
			
			diameterFromArea=circle.calculateDiameterFromArea(10);
			System.out.print("\n Diameter From Area:"+diameterFromArea+"\n");
			
			
			circumferencefromRadius=circle.calculateCircumferenceFromRadius(10);
			System.out.print("\n Circumference From Radius:"+circumferencefromRadius+"\n");
			
			circumferenceFromRadius=circle.calculateCircumferenceFromDiameter(10);
			System.out.print("\n Circumference From Diameter:"+circumferenceFromRadius+"\n");
			
			circumferenceFromArea=circle.calculateCircumferenceFromArea(10);
			System.out.print("\n Circumference From Area:"+circumferenceFromArea+"\n");
				
			
			areafromRadius=circle.calculateAreaFromRadius(10);
			System.out.print("\n Area From Radius:"+areafromRadius+"\n");
			
			areaFromDiameter=circle.calculateAreaFromDiameter(10);
			System.out.print("\n Area From Diameter:"+areaFromDiameter+"\n");
			
			areaFromCircumference=circle.calculateAreaFromCircumference(10);
			System.out.print("\n Area From Circumference :"+areaFromCircumference+"\n");
		}
	
}
