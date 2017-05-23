package com.geniusnine.android.geometry.VolumeCalculator;

import java.util.ArrayList;

public class Capsulecalculator {
    double result;
    double mileResult;
    double milimolResult;
/*
    public double calculateCapsule(double radius, double height, String radiusUnit, String heightUnit) {
        if (radiusUnit.equals("mile")) {
            if (heightUnit.equals("mile")) {
                mileResult = (radius) * 1;
                double resultOne;

                resultOne = 3.14159265358979323 * Math.pow(radius, 2) * height;
                double result = resultOne + 1.333333 * 3.14159265358979323 * Math.pow(radius, 3);

                return result;
            }

            if (heightUnit.equals("yard")) {
                mileResult = (radius) * 1760;
                double resultOne;

                resultOne = 3.14159265358979323 * Math.pow(radius, 2) * height;
                double result = resultOne + 1.333333 * 3.14159265358979323 * Math.pow(radius, 3);

                return result;
            }
            if (heightUnit.equals("foot")) {
                mileResult = (radius) * 5280;
                double resultOne;

                resultOne = 3.14159265358979323 * Math.pow(radius, 2) * height;
                double result = resultOne + 1.333333 * 3.14159265358979323 * Math.pow(radius, 3);

                return result;
            }

            if (heightUnit.equals("inch")) {
                mileResult = (radius) * 63360;
                double resultOne;

                resultOne = 3.14159265358979323 * Math.pow(radius, 2) * height;
                double result = resultOne + 1.333333 * 3.14159265358979323 * Math.pow(radius, 3);

                return result;
            }
            if (heightUnit.equals("kilometer")) {
                mileResult = (radius) * 1.609344;
                double resultOne;

                resultOne = 3.14159265358979323 * Math.pow(radius, 2) * height;
                double result = resultOne + 1.333333 * 3.14159265358979323 * Math.pow(radius, 3);

                return result;
            }

            if (heightUnit.equals("meter")) {
                mileResult = (radius) * 1609.344;
                double resultOne;

                resultOne = 3.14159265358979323 * Math.pow(radius, 2) * height;
                double result = resultOne + 1.333333 * 3.14159265358979323 * Math.pow(radius, 3);

                return result;
            }

            if (heightUnit.equals("centimenter")) {
                mileResult = (radius) * 160934.4;
                double resultOne;

                resultOne = 3.14159265358979323 * Math.pow(radius, 2) * height;
                double result = resultOne + 1.333333 * 3.14159265358979323 * Math.pow(radius, 3);

                return result;
            }

            if (heightUnit.equals("milimeter")) {
                mileResult = (radius) * 1609344;
                double resultOne;

                resultOne = 3.14159265358979323 * Math.pow(radius, 2) * height;
                double result = resultOne + 1.333333 * 3.14159265358979323 * Math.pow(radius, 3);

                return result;
            }

            if (heightUnit.equals("micrometer")) {
                mileResult = (radius) * 1609344000;
                double resultOne;

                resultOne = 3.14159265358979323 * Math.pow(radius, 2) * height;
                double result = resultOne + 1.333333 * 3.14159265358979323 * Math.pow(radius, 3);

                return result;
            }

            if (heightUnit.equals("nanometer")) {
                mileResult = (radius) * 1.609344e+12;
                double resultOne;

                resultOne = 3.14159265358979323 * Math.pow(radius, 2) * height;
                double result = resultOne + 1.333333 * 3.14159265358979323 * Math.pow(radius, 3);

                return result;
            }

            if (heightUnit.equals("angstrom")) {
                mileResult = (radius) * 1.609344e+13;
                double resultOne;

                resultOne = 3.14159265358979323 * Math.pow(radius, 2) * height;
                double result = resultOne + 1.333333 * 3.14159265358979323 * Math.pow(radius, 3);

                return result;
            }
        }*/


	private double mile,yard,foot,inch,kilometer,meter,centimenter,milimeter,micrometer,nanometer ,angstrom;

	
	private double edtValue;
	private String conversionFrom;
	 double baseRadius,height;
		

	   
	public Capsulecalculator(String conversionFrom, int edtValue) {
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
		this.baseRadius = baseRadius;
	    this.height = height;
	}
	
	public ArrayList<ConversionResults> calculateCapsulecalculatorVolume()
    {
    	
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
			
		ConversionResults results= new ConversionResults();
		
		switch(conversionFrom)
		{
		    case "mile":
		    	
		    	mile=(edtValue)*1;
		    	yard=(edtValue)*1760;
		    	foot=(edtValue)*5280;
		    	inch=(edtValue)*63360;
		    	kilometer=(edtValue)*1.609344 ;
		    	meter=(edtValue)*1609.344 ;
		    	centimenter=(edtValue)*160934.4;
		    	milimeter=(edtValue)*1609344;
		    	micrometer=(edtValue)*1609344000;
		    	nanometer=(edtValue)*1.609344e+12;
		    	angstrom=(edtValue)*1.609344e+13;
		    	break;
		    	
		    	
 case "yard":
		    	
		    	mile=(edtValue)*0.0005681818181818;
		    	yard=(edtValue)*1;
		    	foot=(edtValue)*3;
		    	inch=(edtValue)*36 ;
		    	kilometer=(edtValue)*0.0009144 ;
		    	meter=(edtValue)*0.9144;
		    	centimenter=(edtValue)*91.44;
		    	milimeter=(edtValue)*914.4;
		    	micrometer=(edtValue)*914400;
		    	nanometer=(edtValue)*914400000;
		    	angstrom=(edtValue)*0.9144000000E-1;
		    	break;
		    	    	
		    	
		    	
 case "foot":
		    	
		    	mile=(edtValue)*0.0001893939393939;
		    	yard=(edtValue)*0.3333333333333;
		    	foot=(edtValue)*1;
		    	inch=(edtValue)*12 ;
		    	kilometer=(edtValue)*0.0003048  ;
		    	meter=(edtValue)*0.3048;
		    	centimenter=(edtValue)*30.48 ;
		    	milimeter=(edtValue)*304.8;
		    	micrometer=(edtValue)*304800;
		    	nanometer=(edtValue)*304800000;
		    	angstrom=(edtValue)*0.3048000000e-1 ;
		    	break;
		    	
		    	
 case "inch":
 	
 	mile=(edtValue)*0.00001578282828283 ;
 	yard=(edtValue)*0.02777777777778 ;
 	foot=(edtValue)*0.08333333333333 ;
 	inch=(edtValue)*1 ;
 	kilometer=(edtValue)*0.0000254   ;
 	meter=(edtValue)*0.0254 ;
 	centimenter=(edtValue)*2.54  ;
 	milimeter=(edtValue)*25.4 ;
 	micrometer=(edtValue)*25400 ;
 	nanometer=(edtValue)*25400000 ;
 	angstrom=(edtValue)*254000000  ;
 	break;
		   
 	
 	
 case "kilometer":
	 	
	 	mile=(edtValue)*0.6213711922373  ;
	 	yard=(edtValue)*1093.613298338  ;
	 	foot=(edtValue)* 3280.839895013 ;
	 	inch=(edtValue)*39370.07874016  ;
	 	kilometer=(edtValue)*1   ;
	 	meter=(edtValue)*1000  ;
	 	centimenter=(edtValue)* 100000 ;
	 	milimeter=(edtValue)* 1000000;
	 	micrometer=(edtValue)* 1000000000;
	 	nanometer=(edtValue)*1E12  ;
	 	angstrom=(edtValue)* 1e+13 ;
	 	break;
	 	
	 	
 case "meter":
	 	
	 	mile=(edtValue)* 0.0006213711922373;
	 	yard=(edtValue)* 1.093613298338;
	 	foot=(edtValue)* 3.280839895013;
	 	inch=(edtValue)* 39.37007874016;
	 	kilometer=(edtValue)* 0.001;
	 	meter=(edtValue)*1 ;
	 	centimenter=(edtValue)*100;
	 	milimeter=(edtValue)* 1000;
	 	micrometer=(edtValue)*1000000;
	 	nanometer=(edtValue)*1000000000;
	 	angstrom=(edtValue)*1E10;
	 	break;
	 	
	 	
 case "centimenter":
	 	
	 	mile=(edtValue)* 0.000006213711922373 ;
	 	yard=(edtValue)*0.01093613298338  ;
	 	foot=(edtValue)*0.03280839895013  ;
	 	inch=(edtValue)*0.3937007874016  ;
	 	kilometer=(edtValue)* 0.00001 ;
	 	meter=(edtValue)* 0.01 ;
	 	centimenter=(edtValue)*1;
	 	milimeter=(edtValue)*10  ;
	 	micrometer=(edtValue)*10000 ;
	 	nanometer=(edtValue)*10000000 ;
	 	angstrom=(edtValue)*100000000 ;
	 	break;
	 	
	 	
	 	
 case "milimeter":
	 	
	 	mile=(edtValue)* 6.213711922373e-7 ;
	 	yard=(edtValue)*  0.001093613298338;
	 	foot=(edtValue)* 0.003280839895013  ;
	 	inch=(edtValue)* 0.03937007874016 ;
	 	kilometer=(edtValue)* 0.000001  ;
	 	meter=(edtValue)*  0.001 ;
	 	centimenter=(edtValue)*0.1 ;
	 	milimeter=(edtValue)*1  ;
	 	micrometer=(edtValue)*1000  ;
	 	nanometer=(edtValue)* 1000000 ;
	 	angstrom=(edtValue)*10000000 ;
	 	break;
	 	
	 	
 case "micrometer":
	 	
	 	mile=(edtValue)*  6.213711922373e-10;
	 	yard=(edtValue)*0.000001093613298338  ;
	 	foot=(edtValue)* 0.000003280839895013   ;
	 	inch=(edtValue)* 0.00003937007874016  ;
	 	kilometer=(edtValue)*  1e-9 ;
	 	meter=(edtValue)* 9.999999999999e-7 ;
	 	centimenter=(edtValue)*0.0001;
	 	milimeter=(edtValue)*0.001 ;
	 	micrometer=(edtValue)*1  ;
	 	nanometer=(edtValue)*1000   ;
	 	angstrom=(edtValue)*10000  ;
	 	break;
	 	
	 	
 case "nanometer":
	 	
	 	mile=(edtValue)* 6.213711922373e-13 ;
	 	yard=(edtValue)* 1.093613298338e-9 ;
	 	foot=(edtValue)* 3.280839895013e-9   ;
	 	inch=(edtValue)* 3.937007874016e-8  ;
	 	kilometer=(edtValue)* 9.999999999999e-13  ;
	 	meter=(edtValue)* 9.999999999999e-10 ;
	 	centimenter=(edtValue)*9.999999999999e-8;
	 	milimeter=(edtValue)* 9.999999999999e-7;
	 	micrometer=(edtValue)* 0.0009999999999999 ;
	 	nanometer=(edtValue)*1   ;
	 	angstrom=(edtValue)* 10 ;
	 	break;
	 	
	 	
 case "angstrom":
	 	
	 	mile=(edtValue)*  6.213711922373e-14;
	 	yard=(edtValue)* 1.093613298338e-10 ;
	 	foot=(edtValue)*  3.280839895013e-10  ;
	 	inch=(edtValue)* 3.937007874016e-9  ;
	 	kilometer=(edtValue)* 1e-13  ;
	 	meter=(edtValue)* 1e-10 ;
	 	centimenter=(edtValue)*1e-8;
	 	milimeter=(edtValue)* 1e-7;
	 	micrometer=(edtValue)* 0.0001  ;
	 	nanometer=(edtValue)* 0.1  ;
	 	angstrom=(edtValue)* 1 ;
	 	break;
		}
		
		
		
			 results.setMile(mile);
			 results.setYard(yard);
			 results.setFoot(foot);
			 results.setInch(inch);
			 results.setKilometer(kilometer);
			 results.setMeter(meter);
			 results.setCentimenter(centimenter);
			 results.setMilimeter(milimeter);
			 results.setMicrometer(micrometer);
			 results.setNanometer(nanometer);
			 results.setAngstrom(angstrom);
			  converterArray.add(results);
			    return converterArray;
			    
		
    } 
	
	 
	public double getbaseRadius() {
		return baseRadius;
	}
	public void setbaseRadius(double radius) {
		this.baseRadius = baseRadius;
	}
	
	public double getheight() {
		return height;
	}
	public void setheight(double height) {
		this.height = height;
	}

	public class ConversionResults{
		private double mile,yard,foot,inch,kilometer,meter,centimenter,milimeter,micrometer,nanometer ,angstrom;

		public double getMile() {
			return mile;
		}

		public void setMile(double mile) {
			this.mile = mile;
		}

		public double getYard() {
			return yard;
		}

		public void setYard(double yard) {
			this.yard = yard;
		}

		public double getFoot() {
			return foot;
		}

		public void setFoot(double foot) {
			this.foot = foot;
		}

		public double getInch() {
			return inch;
		}

		public void setInch(double inch) {
			this.inch = inch;
		}

		public double getKilometer() {
			return kilometer;
		}

		public void setKilometer(double kilometer) {
			this.kilometer = kilometer;
		}

		public double getMeter() {
			return meter;
		}

		public void setMeter(double meter) {
			this.meter = meter;
		}

		public double getCentimenter() {
			return centimenter;
		}

		public void setCentimenter(double centimenter) {
			this.centimenter = centimenter;
		}

		public double getMilimeter() {
			return milimeter;
		}

		public void setMilimeter(double milimeter) {
			this.milimeter = milimeter;
		}

		public double getMicrometer() {
			return micrometer;
		}

		public void setMicrometer(double micrometer) {
			this.micrometer = micrometer;
		}

		public double getNanometer() {
			return nanometer;
		}

		public void setNanometer(double nanometer) {
			this.nanometer = nanometer;
		}

		public double getAngstrom() {
			return angstrom;
		}

		public void setAngstrom(double angstrom) {
			this.angstrom = angstrom;
		}
	}
	
	
	
	public double cylindricalVolumeCalci()
		
		{
			double result=3.14159265358979323*Math.pow(baseRadius, 2)*height;
			return result;
		}
	
/*
public static class CylindricalVolumeMain {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Capsulecalculator iA = new Capsulecalculator("mile",1);
			
			ArrayList<ConversionResults> results = iA.calculateCapsulecalculatorVolume();
			int length = results.size();

		

CylindricalVolumeCalculator cylindricalVolumecal=new CylindricalVolumeCalculator(7,2);

			
			double result=iA.cylindricalVolumeCalci();
			System.out.print("Cylindrical Tank Volume Calculator Value:"+result);
			
			
			
			for(int i = 0; i <length; i++){
				
				ConversionResults item  =  results.get(i);
				
		    	System.out.println("\n mile - " +new DecimalFormat("##.################").format( item.getMile())
				
					+"\n yard - " +new DecimalFormat("##.################").format( item.getYard())

					+"\n foot - " +new DecimalFormat("##.################").format( item.getFoot())
					
					+"\n inch - " +new DecimalFormat("##.################").format( item.getInch())
					
					+"\n kilometer - " +new DecimalFormat("##.################").format( item.getKilometer())
					
					+"\n meter - " +new DecimalFormat("##.################").format( item.getMeter())
				
					+"\n centimenter - " +new DecimalFormat("##.################").format( item.getCentimenter())
					
					+"\n milimeter - " +new DecimalFormat("##.################").format( item.getMilimeter())

					+"\n micrometer - " +new DecimalFormat("##.################").format( item.getMicrometer())
					
					+"\n nanometer - " +new DecimalFormat("##.################").format( item.getNanometer())
					
					+"\n angstrom - " +new DecimalFormat("##.################").format( item.getAngstrom())
					);
			

	
			}
		}
		}
*/





}
