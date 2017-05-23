package com.geniusnine.android.geometry.AreaCalculator;

public class CircleAreaCalci {
	 double radius;
		
	 /*
	    public CircleAreaCalci(double radius) {
	        this.radius = radius;
	       
	        
	    }
	    
	
public double getradius() {
			return radius;
		}


		public void setradius(double radius) {
			this.radius = radius;
		}*/

	public double CircleAreaCalci(double radius)
		{
		
			double result=3.14159265358979323*Math.pow(radius,2);
			return result;
		}
		

		/*public static class CircleAreaCalciMain {
			
			public static void main(String arg[])
			{
				
				CircleAreaCalci coneVolumecal=new CircleAreaCalci(7);
				double result=coneVolumecal.CircleAreaCalci();

				System.out.print(" Circle Area Calculator: "+result);
	
			}
		}*/
}
