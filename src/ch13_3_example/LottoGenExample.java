package ch13_3_example;

import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LottoGenExample {
	
	static final int MAx = 45;
	static final int COUNT = 6;
	
	public static void main(String[] args) {
		
		/** [로또 번호 생성기]
		 * 중복저장 되지 않은 HashSet이용
		 */
		
		// 번호 생성 Math.random()
		// Set 자료구조에 넣기
		
		Set<Integer> set = new HashSet<>(COUNT);
		
		int n = 0; 
		while(set.size() < COUNT) {
			n++;
			set.add((int)(Math.random() * MAx) + 1);
		} 
		
		List<Integer> lotto = new LinkedList<>(set);
		
		Collections.sort(lotto);
		
		System.out.println(lotto + ", " + n + "회");
	}
}
