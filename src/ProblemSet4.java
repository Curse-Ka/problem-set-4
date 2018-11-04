/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */
import java.lang.Math;

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
		
		System.out.println(ps.surroundMe("<<>>", "abc"));
		System.out.println(ps.surroundMe("[[]]", "xyz"));
		System.out.println(ps.surroundMe("abc", "abc"));
		System.out.println(ps.surroundMe("(())", "qwerty"));
		System.out.println(ps.surroundMe(null, "abc"));
		System.out.println(ps.surroundMe("<<>>", null));
		System.out.println("\n");
		System.out.println(ps.endsMeet("qwerty", 2));
		System.out.println(ps.endsMeet("basketball", 3));
		System.out.println(ps.endsMeet("qwerty", -1));
		System.out.println(ps.endsMeet("basketball", 0));
		System.out.println(ps.endsMeet("qwerty", 9));
		System.out.println(ps.endsMeet("programming", 2));
		System.out.println(ps.endsMeet(null, 1));
		System.out.println("\n");
		System.out.println(ps.middleMan("candy"));
		System.out.println(ps.middleMan("candy"));
		System.out.println(ps.middleMan("even"));
		System.out.println(ps.middleMan(null));
		System.out.println("\n");
		System.out.println(ps.doubleVision("qwerty"));
		System.out.println(ps.doubleVision("a"));
		System.out.println(ps.doubleVision(null));
		System.out.println("\n");
		System.out.println(ps.centered("candy", "and"));
		System.out.println(ps.centered("programming", "ram"));
		System.out.println(ps.centered("qwerty", "qwe"));
		System.out.println(ps.centered("qwerty", "er"));
		System.out.println(ps.centered("qwerty", null));
		System.out.println(ps.centered(null, "abc") );
		System.out.println(ps.centered(null, null));
		System.out.println("\n");
		System.out.println(ps.upOrDown(12.7, 'r'));
		System.out.println(ps.upOrDown(12.2, 'r'));
		System.out.println(ps.upOrDown(12.7, 'f'));
		System.out.println(ps.upOrDown(12.2, 'c'));
		System.out.println(ps.upOrDown(12.7, 'x'));
		System.out.println("\n");
		System.out.println(ps.countMe("these are just some sample words", 'e'));
		System.out.println(ps.countMe(null, 'n'));
		System.out.println(ps.countMe("and some more sample words", '+'));
		System.out.println(ps.countMe("one more batch of sample words", 'h'));
		System.out.println("\n");
		System.out.println(ps.isNotEqual("is not is not is"));
		System.out.println(ps.isNotEqual("is not is not is not"));
		System.out.println(ps.isNotEqual(null));
		System.out.println("\n");
		System.out.println(ps.triplets("abbbccccd"));
		System.out.println(ps.triplets("aaabbbbccccc"));
		System.out.println(ps.triplets(null));
		System.out.println(ps.triplets("abbb1ccc"));
		System.out.println(ps.triplets("aaa bbb"));
		System.out.println("\n");
		System.out.println(ps.addMe("a123b456c789", true));
		System.out.println(ps.addMe("a123b456c789", false));
		System.out.println(ps.addMe(null, true));
		System.out.println(ps.addMe("abc 123 def", true));
	}
	
	// 1 
	public String surroundMe(String out, String in) {
		if (out == null || in == null) {
			return null;
		}
		int outLength = out.length();
		int inLength = in.length();
		
		if (outLength != 4 || inLength != 3 || out.charAt(0) != out.charAt(1) || out.charAt(2) != out.charAt(3)) {
			return null;
		}
		
		return (out.substring(0, 2) + in + out.substring(2, 4));
	}
	
	// 2
	public String endsMeet(String str, int n) {
		if (str == null) {
			return null;
		}
		
		int strLength = str.length();
		
		if (strLength < 1 || strLength > 10 || n < 1 || n > strLength) {
			return null;
		}
		
		return (str.substring(0, n) + str.substring(strLength - n));
	}
	
	// 3
	public String middleMan(String str) {
		if (str == null) {
			return null;
		}
		
		int strLength = str.length();
		
		if (strLength % 2 == 0) {
			return null;
		}
		
		return (str.substring((strLength/2 - 1), (strLength/2 + 2)));
	}
	
	// 4
	public String doubleVision(String str) {
		if (str == null) {
			return null;
		}
		
		int strLength = str.length();
		
		
		String returnString = "";
		
		for (int i = 0; i < strLength; i++)	{
			returnString += str.charAt(i) + "" + str.charAt(i);
		}
		
		return returnString;
	}
	
	// 5
	public boolean centered(String str, String target) {
		if (str == null || target == null) {
			return false;
		}
		
		int strLength = str.length();
		int tarLength = target.length();
		
		if (tarLength != 3) {
			return false;
		}
		
		String sub = "";
		String sub2 = "";
		if (strLength % 2 == 0) {
			sub = str.substring((strLength / 2 - 2), (strLength / 2 + 1));
			sub2 = str.substring((strLength / 2 - 1), (strLength / 2 + 2));
		} else {
			sub = str.substring((strLength / 2 - 1), (strLength / 2 + 2));
		}
		
		return (target.equals(sub) || target.equals(sub2)) ? true : false;
		
		
	}
	
	// 6
	public int upOrDown(double number, char operation) {
		if (operation == 'r') {
			return (int) Math.round(number);
		} else if (operation == 'f') {
			return (int) Math.floor(number);
		} else if (operation == 'c') {
			return (int) Math.ceil(number);
		} else {
			return -1;
		}
	}
	
	// 7
	public int countMe(String text, char end) {
		if (end < 45 || end > 122 || text == null) {
			return -1;
		}
		
		int length = text.length();
		int count = 0;
		text += " ";
		for (int i = 0; i < length; i++) {
			if (text.charAt(i+1)== ' ' && text.charAt(i)==end) {
				count++;
			}
		}
		return count;
	}
	
	// 8
	public boolean isNotEqual(String str) {
		if (str == null) {
			return false;
		}
		
		int length = str.length();
		int is = 0;
		int not = 0;
		
		for (int i = 0; i < length - 1; i++) {
			if (str.substring(i, i + 2).equals("is")) {
				is++;
			}
		}
		
		for (int i = 0; i < length - 2; i++) {
			if (str.substring(i, i + 3).equals("not")) {
				not++;
			}
		}
		
		return (is == not) ? true : false;
	}
	
	// 9
	public int triplets(String str) {
		if (str == null) {
			return -1;
		}
		
		int length = str.length();
		int count = 0;
		for (int i = 0; i < length - 2; i++) {
			if ((str.charAt(i) < 'A' || (str.charAt(i) > 'Z' && str.charAt(i) < 'a') || str.charAt(i) > 'z')) {
				return -1;
			}
			
			if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
				count++;
			}
		}
		
		return count;
	}
	
	// 10
	public int addMe(String str, boolean digits) {
		if (str == null) {
			return -1;
		}
		
		int length = str.length();
		int sum = 0;
		
		for (int check = 0; check < length; check++) {
			if (str.charAt(check) == ' ' ) {
				return -1;
			}
		}
		
		if (digits) {
			int tempNum;
			for (int i = 0; i < length; i++) {
				if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
					tempNum = Integer.parseInt(String.valueOf(str.charAt(i)));
					sum += tempNum;
				}
			}
		} else {
			str += " ";
			String number = "0";
			for (int i = 0; i <= length; i++) {
				char digit = str.charAt(i);
				if (digit >= '0' && digit <= '9') {
					number += digit;
				} else {
					if (Integer.parseInt(String.valueOf(number)) != 0) {
						sum += Integer.parseInt(String.valueOf(number));
					}
					number = "0";
				}
			}
		}
		return sum;
	}
}