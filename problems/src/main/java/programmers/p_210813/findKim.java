package programmers.p_210813;

import java.util.Arrays;

public class findKim {
	public static void main(String[] args) {
		String[] seoul = {"Jane","Kim"};
		solution(seoul);
	}
	public static String solution(String[] seoul) {
		int x= 0;
		x= Arrays.asList(seoul).indexOf("Kim");
		String answer ="김서방은 "+ x + "에 있다";
		System.out.println(answer);
		return answer;
				
	}

}
