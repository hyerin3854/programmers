package programmers.p_210805;

import java.util.ArrayList;

public class Phoneketmon {
	public static void main(String[] args) {	
		int[] nums = {3,3,3,2,2,2,4};
		int result = solution(nums);
	}
	//n������ ���ϸ��� ������ n/2������ ���ϸ��� ��� �ִ밡���� ���������� ����ؾ���
	public static int solution(int[] nums) {
		int answer = 0;
		int size = (nums.length) /2;
		//�ߺ����Ÿ� ���� arrayList. Set�� ����ص� ����.
		//plist�� ���ϸ� ������ ��� list
		ArrayList<Integer> plist = new ArrayList<Integer>();
		for(int data: nums) {
			if(!plist.contains(data)){
				plist.add(data);
			}
		}
		int cnt = plist.size();
		//size�� n/2 ����, cnt�� ������ ����
		if(size < cnt) {
			answer = size;
		}else {
			answer = cnt;
		} 
		System.out.println(answer);
		return answer;

	}

}
