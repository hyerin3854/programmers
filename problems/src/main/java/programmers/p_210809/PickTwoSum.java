package programmers.p_210809;

import java.util.ArrayList;
import java.util.Arrays;

public class PickTwoSum {

	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		solution(numbers);

	}

	public static int[] solution(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				result = numbers[i] + numbers[j];
				if (!list.contains(result)) {
					list.add(result);

				}

			}
		}
		//두개의 수를 뽑아 더해서 모든 수를 배열에 오름차순으로 정리
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		Arrays.sort(answer);
//		for(int i : answer) {
//			System.out.println(i);
//		}
		return answer;

	}
}
