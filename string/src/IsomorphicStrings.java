import java.util.HashMap;
import java.util.Map;

/***
 * 205. Isomorphic Strings
 * 
 * Easy
 * 
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * Example 1:
 * 
 * Input: s = "egg", t = "add"
 * 
 * Output: true
 * 
 * Example 2:
 * 
 * Input: s = "foo", t = "bar"
 * 
 * Output: false
 * 
 * Example 3:
 * 
 * Input: s = "paper", t = "title"
 * 
 * Output: true
 * 
 * Note:
 * 
 * You may assume both s and t have the same length.
 *
 */
public class IsomorphicStrings {
	//Time O(n^2) space O(n)
	public boolean isIsomorphic(String s, String t) {
		if (s == null || t == null)
			return false;
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			char b = t.charAt(i);
			if (map.containsKey(a)) {
				if (map.get(a).equals(b))
					continue;
				else
					return false;
			} else {
				if (!map.containsValue(b)) {
					map.put(a, b);
				}
				else return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		IsomorphicStrings test = new IsomorphicStrings();
		System.out.println(test.isIsomorphic("egg", "add"));
	}
}
