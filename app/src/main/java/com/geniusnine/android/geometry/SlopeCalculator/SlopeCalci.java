package com.geniusnine.android.geometry.SlopeCalculator;

public class SlopeCalci {
	
	
/*	m = (y2 - y1) / (x2 - x1)*/
	

	 double x1Axis,x2Axis,y1Axis,y2Axis;
		
	 /*
	    public SlopeCalci(double x1Axis,double x2Axis,double y1Axis,double y2Axis) {
	        this.x1Axis = x1Axis;
	        this.x2Axis = x2Axis;
	        this.y1Axis = y1Axis;
	        this.y2Axis = y2Axis;
	    }
	    
		public double getx1Axis() {
			return x1Axis;
		}
		public void setx1Axis(double x1Axis) {
			this.x1Axis = x1Axis;
		}
		
	
		
		public double getx2Axis() {
			return x2Axis;
		}
		public void setx2Axis(double x2Axis) {
			this.x2Axis = x2Axis;
		}
		
		
		public double gety1Axis() {
			return y1Axis;
		}
		public void sety1Axis(double y1Axis) {
			this.y1Axis = y1Axis;
		}

		public double gety2Axis() {
			return y2Axis;
		}
		public void sety2Axis(double y2Axis) {
			this.y2Axis = y2Axis;
		}*/
		
public double SlopeCalciCalci(double x1,double x2,double y1,double y2)
		
		{
	
			double result=(y2-y1);
			double resultOne=result/(x2-x1);
			return resultOne;
		}
		
/*

		public static class SquarePyramidCalciMain {
			
			public static void main(String arg[])
			{
				
				SlopeCalci coneVolumecal=new SlopeCalci(5,3,2,3);
				double result=coneVolumecal.SlopeCalciCalci();
				System.out.print(" Slope Calculator"+result);
	
			}
		}
*/

		
}
