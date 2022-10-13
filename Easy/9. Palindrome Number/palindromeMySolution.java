package Easy.palindromeNumber;

/**
 * Submitted 09/06/2022
 * 
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is a palindrome while 123 is not
 */

public class palindromeMySolution {
    public static void main(String[] args) {
        /**
         * Example 1:
         * input: x = 121
         * output: true
         * Explanation: 121 reads as 121 from left to right and right to left
         */
        int x = 121;
        System.out.println(isPalindrome(x));

        /**
         * Example 2:
         * input: x = -121
         * output: false
         * Explanation: -121 reads as 121-, so not a palindrome
         */
        x = -121;
        System.out.println(isPalindrome(x));

        /**
         * Example 3:
         * input: x = 10
         * output: false
         * Explanation: 10 reads as 01, so not a palindrome
         */
        x = 10;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) 
            return false;
        else {
            int reverse = 0, num = x;
            while(x != 0) {
                reverse = reverse * 10 + (x % 10);
                x /= 10;
            }
            if (reverse != num) {
                return false;
            }
        }
        return true;
    }
}
