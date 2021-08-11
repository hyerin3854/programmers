package programmers.p_210810;

import java.util.ArrayList;
import java.util.List;

public class Weekly_ch01 {
	public static void main(String[] args) {
//		int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
		int[][] scores = { { 70, 49, 90 }, { 68, 50, 38 }, { 73, 31, 100 } };
		solution(scores);
	}

	public static String solution(int[][] scores) {
		String answer = "";
		for (int i = 0; i < scores.length; i++) {
			List<Integer> list = new ArrayList<Integer>();
			int k = 0;
			for (int j = 0; j < scores.length; j++) {
					// 최댓값 K 넣어주기
					if (scores[j][i] > k) {
						k = scores[j][i];
					}

				 // 73, 50, 100
//				if (scores[j][i] != k) {
//					list.add(scores[j][i]);
//				}
					list.add(k);
			}
	
		}
		for(int i=0; i<scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
			}
			}
		

		return answer;
	}

}
