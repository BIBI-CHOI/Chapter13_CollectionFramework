package ch13_3_example;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;


public class lteratorCollection {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> itr = list.iterator();
		
		// 반복자를 이용하여 순차적 참조
		while(itr.hasNext()) {
			System.out.println(itr.next() + "\t");
		}
		itr = list.iterator();
		System.out.println("=================");
		
		while(itr.hasNext()) {
			System.out.println(itr.next() + "\t");
		}
		itr = list.iterator();
	}
}
