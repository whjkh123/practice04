package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] won = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
				
		System.out.print("금액: ");
		int money = sc.nextInt();
		
		for(int i = 0; i < won.length; i++) {
			if(money / won[i] > 0) {
				System.out.println(won[i] + "원: " + money / won[i] + "개");
				money %= won[i];
			}
		}
		sc.close();

	}

}
