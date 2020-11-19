package com.javaex.practice04;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] num = new int[6];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					num[i]--;
				}
			}
			System.out.println(num[i]);
		}
	}

}
