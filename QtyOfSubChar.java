/**
 * @Description To count how many separating characters or substrings in a given string.
 * @author WoeBalu
 * @CreateDate 2018-11-13
 * @param A given string; a substring or a separating character.
 * @return The quantity of the substring or the separating character in the string.
 */
 
public class QtyOfSubChar {
	public int countSubstr(String Str, String SubStr) {
		int lenOfStr = Str.length();
		int lenOfSubstr = Str.replace(SubStr, "").length();
		return lenOfStr - lenOfSubstr;
	}
}
