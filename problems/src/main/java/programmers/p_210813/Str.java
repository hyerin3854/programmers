package programmers.p_210813;

public class Str {
	public static void main(String[] args) {
		String s = "a234";
		solution(s);
	}

	public static boolean solution(String s) {
		boolean an =true;
		if (s.length() != 4 || s.length() != 6)
			an =false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' && s.charAt(i) > '9')
				an= false;
		}
		System.out.println(an);
		return an;
	}

}
