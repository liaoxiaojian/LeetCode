/**
 * 
 * @author Demon 2016.8.14
 * 
 *         Given a roman numeral, convert it to an integer.
 * 
 *         Input is guaranteed to be within the range from 1 to 3999.
 *
 */
public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.romanToInt("I"));
		System.out.println(solution.romanToInt("IX"));
		System.out.println(solution.romanToInt("VI"));
		System.out.println(solution.romanToInt("XCIX"));
		System.out.println(solution.romanToInt("XXI"));
	}

	public int romanToInt(String s) {
		int res = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			switch (c) {
			case 'I':
				res += (res >= 5 ? -1 : 1);
				break;
			case 'V':
				res += 5;
				break;
			case 'X':
				res += 10 * (res >= 50 ? -1 : 1);
				break;
			case 'L':
				res += 50;
				break;
			case 'C':
				res += 100 * (res >= 500 ? -1 : 1);
				break;
			case 'D':
				res += 500;
				break;
			case 'M':
				res += 1000;
				break;
			}
		}
		return res;
	}

}
