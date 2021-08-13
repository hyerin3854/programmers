package programmers.p_210813;

import java.util.ArrayList;
import java.util.Collections;

public class Wordascending {
	public static void main(String[] args) {
		String [] strings = {"sun","bed","car"};
		int n = 1;
		solution(strings,n);
	}
	public static String[] solution(String[] strings, int n) {
		String[] answer =new String[strings.length];
		
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0; i<strings.length; i++) {
				arr.add(strings[i].charAt(n)+strings[i]);
			
		}
		Collections.sort(arr);
		
		for(int i=0; i<arr.size(); i++) {
			answer[i] =arr.get(i).substring(1);
		}
		return answer;
	}

}
