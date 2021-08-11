package programmers.p_210811;
import java.util.*;

public class StrDescend {
	public static void main(String[] args) {
         String s="Zbcdefg";
         solution(s);
	}
	//문자를 큰것부터 작은순(내림차순), 대문자는 소문자보다 작은것으로 간주
	public static String solution(String s) {
		Character [] arr = new Character [s.length()];
		//char타입으로 변환해서 arr에 담아준다
		for(int i=0; i<arr.length; i++) {
			arr[i] =s.charAt(i);
		}
		//정렬
		Arrays.sort(arr,Collections.reverseOrder());
		String answer ="";
		for(int i=0; i<arr.length; i++) {
		      answer += arr[i];
		      
		}
		System.out.println(answer);
		return answer;
	}
}
