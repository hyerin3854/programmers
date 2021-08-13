package programmers.p_210810;


public class Weekly_ch01 {
	public static void main(String[] args) {
		int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
		//int[][] scores = { { 70, 49, 90 }, { 68, 50, 38 }, { 73, 31, 100 } };
		solution(scores);
	}
	public static String solution(int[][] scores) {
		String answer = "";
		
		for (int j = 0; j < scores.length; j++) {
			int selfScore = scores[j][j]; //자신이 평가한 점수
			int count =	 scores.length;  //3
			
			int min = Integer.MAX_VALUE;
			int max= Integer.MIN_VALUE;
			
			boolean flag = true; //
			int summary = 0;
			
			for(int i=0; i<scores.length; i++) {
				int score = scores[i][j];
				
				if(i != j && selfScore == score) {
					flag= false;
				}
				
				min = Math.min(min, score);
				max = Math.max(max, score);	
				
				summary += score; //다 더해준다
			}
			//최솟값,최댓값이 자신이 평가할 점수일 경우
			if(flag && (min ==selfScore || max == selfScore)) {
				count --;
				summary -= selfScore;
			}
			System.out.println(summary);
		    answer += calculateRank((double)summary / (double)count);
		}
		return answer;
	}
	public static String calculateRank(double score) {
		if(score >= 90.0) 
			return "A";
		else if(score >= 80.0)
			return "B";
		else if(score >= 70.0)
			return "C";
		else if(score >= 60.0)
			return "D";
		else
			return "F";
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
