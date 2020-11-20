package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		double sum = 0;
		
		num[0] = (int)(sc.nextInt());
		num[1] = (int)(sc.nextInt());
		num[2] = (int)(sc.nextInt());
		num[3] = (int)(sc.nextInt());
		num[4] = (int)(sc.nextInt());

		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		sc.close();
		
		System.out.println("평균은 " + sum / 5 + "입니다.");
	}

}
