package com.yang.code.test;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		int[] array = { 5, 0, 0, 4, 1, 2, 3, 4 };

		System.out.println(solution(8));
	}

	public static int solution(int number) {
		int answer = 0;

		while (number != 1) {
			if(number % 2 == 1) {
				answer++;
			}
			number = number / 2;
		}
		
		if(number==1) {
			answer++;
		}

		return answer;
	}
}
