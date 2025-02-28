public class PracticeProblem {
	
	public static int calculate(int a, int b, char c) {
		switch (c) {
			case '+':
				return a + b;
			case '-':
				return a - b;
			case '*':
				return a*b;
			case '/':
				return a/b;
			case '%':
				return a%b;
			case '^':
				int ans = 1;
				for (int i = 0; i < b; ++i) ans *= a;
				return ans;
		}
		return -1;
	}

	public static boolean isPartOfAWordAccordingToMrKalisz(char c) { // :(
		if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z') || c == '\'' || c == '_') return true;
		return false;
	}

	final static int MAXIMUM = 10;
	public static boolean totalWordsChecker(String s) {	
		int count = 0;
		for (int i = 0; i < s.length() - 1; ++i) {
			if (isPartOfAWordAccordingToMrKalisz(s.charAt(i)) && !isPartOfAWordAccordingToMrKalisz(s.charAt(i + 1))) ++count;
			else if (isPartOfAWordAccordingToMrKalisz(s.charAt(i + 1)) && i + 1 == s.length() - 1) ++count;
		}
		return count <= MAXIMUM;
	}

	public static String minString(String a, String b, String c) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		c = c.toLowerCase();
		if (a.compareTo(b) <= 0 && a.compareTo(c) <= 0) return a;
		else if (b.compareTo(c) <= 0) return b;
		else return c;
	}

}
