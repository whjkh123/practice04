package com.javaex.practice04;

public class Ex06 {

	public static void main(String[] args) {
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		c[4] = ',';
		c[7] = ',';
		c[9] = ',';		
		
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

	}

}
