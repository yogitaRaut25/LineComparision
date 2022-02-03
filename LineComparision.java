package com.linecomparision.java;

import java.util.Scanner;

public class Uc1_LineComparision {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        double x1,x2,y1,y2;
        int distance;
        
        System.out.println("enter x1 & y1 values of first point");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        
        System.out.println("enter x2 & y2 values of second point");
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        
        distance=(int)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance between two points = "+distance);

	}

}
