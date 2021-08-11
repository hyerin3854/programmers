package programmers.p_210805;

public class YakCountSum {

	public static void main(String[] args) {
		int left = 24;
		int right = 27;
		solution(left, right);
	}
	public static int solution(int left, int right)
	{
		int answer=0;
		int s= (int) Math.ceil(Math.sqrt(left));
		int ss = s * s;
		for (int i = left; i<= right; i++) {
			if (i== ss) {
				answer -= i;
				s++;
				ss= s * s;	
			}else {
				answer += i;
			}
		}
		System.out.println(answer);
		return answer;
		
	}

}
