/**
 * Submitted: 09/07/2022
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string.
 * 
 * Time: O(n) - worst case is n equal strings with m equal lengths O(m*n)
 * Space: O(1)
 */
public class longestCommonPrefixOptimal {

    public static void main(String[] args) {
        /**
         * Example 1
         * input: strs = ["flower", "flow", "flight"]
         * output: "fl"
         */
        String strs1[] = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs1));

        /**
         * Example 2
         * input: strs = ["dog", "racecar", "car"]
         * output: ""
         * Explanation: There is no common prefix
         */
        String strs2[] = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs2));
        
    }

    public static String longestCommonPrefix(String[] strs) {
        String word = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(word) != 0) {
                word = word.substring(0, word.length()-1);
                if (word.isEmpty()) return "";
            }
        }
        return word;
    }
}