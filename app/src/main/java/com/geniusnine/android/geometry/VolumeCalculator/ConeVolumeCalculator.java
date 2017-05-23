package com.geniusnine.android.geometry.VolumeCalculator;

public class ConeVolumeCalculator {

	 double radius,height;
		
	    
	  /*  public ConeVolumeCalculator(double radius,double height) {
	        this.radius = radius;
	        this.height = height;
	        
	    }
	    
		public double getradius() {
			return radius;
		}
		public void setradius(double radius) {
			this.radius = radius;
		}
		
		public double getheight() {
			return height;
		}
		public void setheight(double height) {
			this.height = height;
		}*/
		
		public double coneVolumeCalci()
		
		{
			double resultOne;
			
			resultOne=0.33333*3.14159265358979323;
			
			double result=resultOne*Math.pow(radius, 2)*height;
			return result;
		}
		
		
	/*	public static class coneVolumeCalciMain {
			
			public static void main(String arg[])
			{
				
				ConeVolumeCalculator coneVolumecal=new ConeVolumeCalculator(7,2);
				double result=coneVolumecal.coneVolumeCalci();

				System.out.print("Cone Volume Calculator Value:"+result);
		
			}
		}*/
}
