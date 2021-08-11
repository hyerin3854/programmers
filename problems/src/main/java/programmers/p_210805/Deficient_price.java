package programmers.p_210805;

public class Deficient_price {
	public static void main(String[] args) {
		int price= 3;
		int money= -30;
		int count = 4;
		solution(price,money,count);
		int a=Math.abs(money);
		System.out.println(a);
	}
	public static long solution(int price, int money,int count) {
		long answer = -1;
		int k=0;
		for(int i=1; i<=count; i++) {
			k += price * i;
			
		}
		answer = k-money;
		if(k<= money) {
			answer=0;
		}else {
			
		}
		System.out.println(answer);
		return answer;
	}
}
