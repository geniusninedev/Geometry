package com.geniusnine.android.geometry.TriangleCalculator;

import java.util.Scanner;


public class TriangleCalci {

    public static void main(String args[]) {

        int side1; int side2; int side3;
        int side1s; int side2s; int side3s; 
        Boolean Triangle;
        String TriangleType;
        String Q1 = "What is the first side of the Triangle?";
        String Q2 = "What is the second side of the Triangle?";
        String Q3 = "What is the third side of the Triangle?";

        Scanner input = new Scanner(System.in);
        System.out.println(Q1);
        side1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println(Q2);
        side2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println(Q3);
        side3 = input3.nextInt();


        if(side1 + side2 > side3) {
            Triangle = true;
            System.out.println("The triangle is true!");

        } else {
            Triangle = false;
            System.out.println("The Triangle is False!");
            return ;

        }

        if(Triangle == true) {
            side1s = side1 * side1;
            side2s = side2 * side2;
            side3s = side3 * side3;

            if(side1s + side2s == side3s) {
                TriangleType = "Right";

                System.out.println("The Triangle is..." + TriangleType);



            } else if (side1s + side2s > side3s) {
                TriangleType = "Acute";

                System.out.println("The Triangle is..." + TriangleType);

            } else if(side1s + side2s < side3s) {
                TriangleType = "Obtuse";

                System.out.println("The Triangle is..." + TriangleType);

            } else {
                TriangleType = null;

                System.out.println("The Triangle is..." + TriangleType);



            }


        }


    }



    public boolean calculateSide(double side1,double side2,double side3) {

        Boolean Triangle;
        int side1s;
        int side2s;
        int side3s;
        String TriangleType;
        if (side1 + side2 > side3) {
            Triangle = true;
            System.out.println("The triangle is true!");

        } else {
            Triangle = false;
            System.out.println("The Triangle is False!");


        }
           return  true;
    }


}