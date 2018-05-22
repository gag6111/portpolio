package com.yang.code.ch11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList(10);
		arrayList.add(new Integer(5));
		arrayList.add(new Integer(4));
		arrayList.add(new Integer(0));
		arrayList.add(new Integer(2));
		arrayList.add(new Integer(1));
		arrayList.add(new Integer(3));
		
		ArrayList copyList = new ArrayList(arrayList.subList(1, 4));
		print(arrayList, copyList);
		
		// 정렬 방법! sort시에 generic을 적용하면 해당함수를 사용할 수 없다. 다른 방법이 있을듯!
		Collections.sort(arrayList);
		Collections.sort(copyList);
		print(arrayList, copyList);
		
		System.out.println("arrayList.containsAll(copyList) : "+arrayList.containsAll(copyList));
		
		copyList.add("B");
		copyList.add("C");
		print(arrayList, copyList);
		
		copyList.add(3, "A");
		
		print(arrayList, copyList);
		
		copyList.add(3, "AA");
		print(arrayList, copyList);
		
		System.out.println("arrayList.retainAll(copyList) : "+arrayList.retainAll(copyList));
		print(arrayList, copyList);
		
		//ArrayList에서 for문을 통해 내용물을 제거하는 방법!!
		for(int i=copyList.size()-1; i>=0; i--) {
			if(arrayList.contains(copyList.get(i))) {
				copyList.remove(i);
			}
		}
		
		print(arrayList, copyList);
	}
	
	public static void print(ArrayList arrayList1, ArrayList arrayList2) {
		System.out.println("arrayList1 : "+arrayList1);
		System.out.println("arrayList2 : "+arrayList2);
		System.out.println();
	}
	
}
