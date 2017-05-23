package com.geniusnine.android.geometry.VolumeCalculator;

public class CubeVolumeCalculator {
	 double length;
		
	    
	/*    public CubeVolumeCalculator(double length) {
	        this.length = length;
	        
	    }
	    
		public double getlength() {
			return length;
		}
		public void setlength(double length) {
			this.length = length;
		}
		*/
	public double cubeVolumeCalci(double length)
		
		{
			
			double result=Math.pow(length, 3);
			return result;
		}
	
	/*public static class cubeVolumeCalciMain {
		
		public static void main(String arg[])
		{
			
			CubeVolumeCalculator gdpcal=new CubeVolumeCalculator(7);
			double result=gdpcal.cubeVolumeCalci();

			System.out.print("Cube Volume Calculator Value:"+result);
	
		}
	}
*/
}
