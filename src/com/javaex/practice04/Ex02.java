package com.javaex.practice04;

public class Ex02 {

	public static void main(String[] args) {
		
		double[] dbl = new double[3];
		
		dbl[0] = 1.2;
		dbl[1] = 3.3;
		dbl[2] = 6.7;
		/*
		for(int i = 0; i < dbl.length; i++) {
			System.out.println(dbl[i]);
		}
		*/
		for(int i = dbl.length -1; i >= 0; i--) {
			System.out.println(dbl[i]);
		}
	}

}
