package programmers.p_210811;
import java.util.*;

public class StrDescend {
	public static void main(String[] args) {
         String s="Zbcdefg";
         solution(s);
	}
	//���ڸ� ū�ͺ��� ������(��������), �빮�ڴ� �ҹ��ں��� ���������� ����
	public static String solution(String s) {
		Character [] arr = new Character [s.length()];
		//charŸ������ ��ȯ�ؼ� arr�� ����ش�
		for(int i=0; i<arr.length; i++) {
			arr[i] =s.charAt(i);
		}
		//����
		Arrays.sort(arr,Collections.reverseOrder());
		String answer ="";
		for(int i=0; i<arr.length; i++) {
		      answer += arr[i];
		      
		}
		System.out.println(answer);
		return answer;
	}
}
