
/**
 * Submitted: 09/08/2022
 * 
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * Constraints:
 *      1 <= s.length <= 104
 *      s consists of only English letters and spaces ' '.
 *      There will be at least one word in s.
 */
public class lengthOfLastWord {
    
    public static void main(String[] args) {
        /**
         * Example 1
         * Input: s = "Hello World"
         * Output: 5
         * Explanation: The last word is "World" with length 5.
         */
        String s = "Hello World";
        System.out.println(lenOfLastWord(s));
        
        /**
         * Example 2
         * Input: s = "   fly me   to   the moon  "
         * Output: 4
         * Explanation: The last word is "moon" with length 4.
         */
        s = "   fly me   to   the moon  ";
        System.out.println(lenOfLastWord(s));

        /**
         * Example 3
         * Input: s = "luffy is still joyboy"
         * Output: 6
         * Explanation: The last word is "joyboy" with length 6.
         */
        s = "luffy is still joyboy";
        System.out.println(lenOfLastWord(s));
    }

    public static int lenOfLastWord(String s) {
        String[] test = s.split(" ");
        String lastWord = test[test.length - 1];
        return lastWord.length();
    }
}
