package Easy.validPalindrome;
/**
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 * 
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 * 
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */
public class validPalindromeOptimal {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        s = "race a car";
        System.out.println(isPalindrome(s));
        s = " ";
        System.out.println(isPalindrome(s));
    }

    /**
     * Two pointer solution
     * 
     * Time: O(n) - looping through string
     * Space: O(1) - no costly variables, ie. regex string trimming
     */
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
        int left = 0, right = s.length()-1;

        while (left < right) {
            while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;
            while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            if(s.charAt(left++) != s.charAt(right--))
                return false;
        }

        return true;
    }
}
