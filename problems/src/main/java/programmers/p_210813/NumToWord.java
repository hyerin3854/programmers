package programmers.p_210813;

public class NumToWord {
	public static void main(String[] args) {
		String s ="one4seveneight";
	    String[] num = {"0","1","2","3","4","5","6","7","8","9"};
	    String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"}; 
	    solution(s,num,word);
	}
	//1478로 나와야함
	public static int solution(String s,String[] num, String[] word) {
		int answer=0;
		for(int i=0; i<num.length; i++) {
			s = s.replace(word[i], num[i]);
		}
	    answer= Integer.parseInt(s);
		return answer;
	}

}
