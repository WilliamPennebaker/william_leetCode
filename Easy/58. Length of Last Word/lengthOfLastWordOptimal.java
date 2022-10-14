
/**
 * Submitted: 10/14/2022
 * 
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * Constraints:
 *      1 <= s.length <= 104
 *      s consists of only English letters and spaces ' '.
 *      There will be at least one word in s.
 * 
 * Time: O(s.length())
 * Space: O(1)
 */

public class lengthOfLastWordOptimal {
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

    /**
     * Starting at the end of the string, we will loop through until there are no more white spaces.
     * This means we found our last word and then can loop through or word until we find a white space.
     * Then we just return the length.
     */
    public static int lenOfLastWord(String s) {
        // base case if string is null or empty
        if(s == null || s.length() == 0) return 0;
        // We want the length of last string. Using the length of string we need a var to count down
        int length = 0, i = s.length()-1;
        // loop to check for white space, if there is a white space subtract from counter
        while(i >= 0 && s.charAt(i) == ' ') i--;
        // count the number of consecutive non whitespace characters.
        while(i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        // return the length
        return length;
    }
}
