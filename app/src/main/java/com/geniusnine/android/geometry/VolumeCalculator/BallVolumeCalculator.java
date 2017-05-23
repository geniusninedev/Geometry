package com.geniusnine.android.geometry.VolumeCalculator;

public class BallVolumeCalculator {

	 double radius;
	
	  /*
	    public BallVolumeCalculator(double radius) {
	        this.radius = radius;
	        
	    }
	    
		public double getradius() {
			return radius;
		}
		public void setradius(double radius) {
			this.radius = radius;
		}*/
		
	public double ballVolumeCalci(double radius)
		
		{
			double resultone=1.333333333333*3.14159265358979323;
			double result=resultone*Math.pow(radius, 3);
			return result;
		}
	
	/*public static class ballVolumeCalciMain {
		
		public static void main(String arg[])
		{
			
			BallVolumeCalculator gdpcal=new BallVolumeCalculator(10);
			double result=gdpcal.ballVolumeCalci(34);

			System.out.print("Ball Volume Calculator Value:"+result);
	
		}
	}*/

}
