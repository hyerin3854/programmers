package programmers.p_210805;

import java.util.ArrayList;

public class Phoneketmon {
	public static void main(String[] args) {	
		int[] nums = {3,3,3,2,2,2,4};
		int result = solution(nums);
	}
	//n마리의 포켓몬이 있을때 n/2마리의 포켓몬을 골라서 최대가지의 종류갯수를 출력해야함
	public static int solution(int[] nums) {
		int answer = 0;
		int size = (nums.length) /2;
		//중복제거를 위한 arrayList. Set을 사용해도 무방.
		//plist는 포켓몬 종류를 담는 list
		ArrayList<Integer> plist = new ArrayList<Integer>();
		for(int data: nums) {
			if(!plist.contains(data)){
				plist.add(data);
			}
		}
		int cnt = plist.size();
		//size는 n/2 갯수, cnt는 종류의 갯수
		if(size < cnt) {
			answer = size;
		}else {
			answer = cnt;
		} 
		System.out.println(answer);
		return answer;

	}

}
