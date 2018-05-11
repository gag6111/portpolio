package com.yang.code.test;

public class IteratorTest {
	public static void main(String[] args) {
		String[] testList;
		testList = new String[5];
		testList[0] = "a";
		testList[1] = "b";
		testList[3] = "c";
		testList[4] = "d";
		Iterator iterator = new DealIterator(testList);
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\n");
		}
	}
}
