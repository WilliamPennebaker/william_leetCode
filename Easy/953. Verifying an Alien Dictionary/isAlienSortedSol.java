
/**
 * Submitted: 10/28/2022
 * 
 * In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. 
 * The order of the alphabet is some permutation of lowercase letters.
 * 
 * Given a sequence of words written in the alien language, and the order of the alphabet, 
 * return true if and only if the given words are sorted lexicographically in this alien language.
 * 
 * Constraints:
 *      1 <= words.length <= 100
 *      1 <= words[i].length <= 20
 *      order.length == 26
 *      All characters in words[i] and order are English lowercase letters.
 */

public class isAlienSortedSol {
    
    public static void main(String[] args) {
        /**
         * Example 1:
         * Input: words = ["hello", "leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
         * Output: true
         * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
         */

        /**
         * Example 2:
         * Input: words = ["word", "world", "row"], order = "worldabcefghijkmnpqstuvxyz"
         * Output: false
         * Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
         */

        /**
         * Example 3:
         * Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
         * Output: false
         * Explanation: The first three characters "app" match, and the second string is shorter (in size.) 
         * According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined
         * as the blank character which is less than any other character
         */
    }

    /**
     * Compare adjacent words
     * 1. Initialize a hashmap/array to record the relations between each letter and its ranking in order.
     * 2. Iterate over words and compare each pair of adjacent words.
     *      - Iterate over each letter to find the first different letter between words[i] and words[i+1].
     *          - If words[i+1] ends before words[i] and no different letters are found, then we need to return false because words[i+1] should come before words[i] (ex. apple and app).
     *          - If we find the first different letter and the two words are in the correct order, then we can exit from current iteration and proceed to the next pair of words.
     *          - If we find the first different letter and the two words are in the wrong order, then we can safely return false.
     * 3. If we reach this point, it means that we have examined all pairs of adjacent words and that they are all sorted. So return true.
     * 
     * Time: O(n) - Storing letter order will take O(n) time and we iterate only over words even tho its a nested for loop. O(M+N) here however N for orderMap is fixed to 26 so O(M) - M is words length
     * Space: O(1) - Only extra space here would be for the hashmap/array for storing letter-order for each words. We know this is fixed to 26 so constant space complexity.
     */
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderMap = new int[26]; // Can use either HashMap or int array here.
        for (int i = 0; i < order.length(); i++) {
            orderMap[order.charAt(i) - 'a'] = i; // charAt(i) - 'a' shifts the ascii/unicode value so A-Z is 0-25 and is more suitable for an array index.
        }

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                /**
                 * If we don't find a mismatch letter between words[i] and words[i+1],
                 * we need to examine the case when words are like ("apple", "app")
                 */
                if(j >= words[i + 1].length()) return false; // Basically when the current word length becomes longer than the next word

                if(words[i].charAt(j) != words[i+1].charAt(j)) {    // Comparing the chars for current and next word
                    int currentWordChar = words[i].charAt(j) - 'a'; // Shifting the char so we can compare with orderMap
                    int nextWordChar = words[i+1].charAt(j) - 'a';  // Shifting the char so we can compare with orderMap

                    if(orderMap[currentWordChar] > orderMap[nextWordChar]) return false; // words[i] has the lexicographically larger letter, so we can return false since words are in wrong order

                    else break; // Found first different letter and they are sorted, so we can stop checking the remaining letters
                }
            }
        }

        return true;
    }
}
