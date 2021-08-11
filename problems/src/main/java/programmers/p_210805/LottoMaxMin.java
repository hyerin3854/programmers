package programmers.p_210805;

public class LottoMaxMin {
	public static void main(String[] args) {
		int[] lottos = { 0, 0, 0, 0, 0, 0 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };
		solution(lottos, win_nums);
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = { 0, 0 }; // 공간 할당, int형으로 처리
		int cnt = 0;
		int k = 0;
		// 등수 + cnt = 7, 7-cnt=등수 (0을 제외했을때, 최저 순위)
		// 7-cnt-k =등수 (0이 당첨숫자일경우, 최고순위)
		// answer에 담아준다.
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					cnt++;
				}
			}
			if (lottos[i] == 0) {
				k++;

			}
		}
		answer[0] = 7 - cnt - k;
		answer[1] = 7 - cnt;
		for (int i = 0; i < answer.length; i++) {
			if(answer[i] == 7) {
				answer[i]= 6;
			}
			System.out.println(answer[i]);
		}
		return answer;

	}
}