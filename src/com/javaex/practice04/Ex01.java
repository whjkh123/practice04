package com.javaex.practice04;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i = 0; i < intArray.length; i++) { //정의 된 배열 intArray는 new int[5]로 인해 0부터 4까진의 메모리를 갖는다. 고로 <=부호가 아닌 <부호를 사용해야한다.
			result = result + intArray[i];
		}
		System.out.println(result);

	}

}
