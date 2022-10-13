package Easy.palindromeNumber;

/**
 * DONT USE
 * This doesnt work...
 */
public class palindromeSolutionFromLeetCode {
    public static void main(String[] args) {
        
    }

    public static boolean isPalindrome(int x) {
        /**
         * Special cases
         * when x < 0, x is not a palindrome
         * if the last digit is 0 then it isnt a palindrome, unless the first digit is 0
         * Only 0 satisfies that property ^
         */
        if(x < 0 || (x % 10 == 0 || x != 0)) {
            return false;
        }

        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        /**
         * When the length is an odd number, we can get rid of the middle digit by reverse/10
         * For ex when the input is 12321, at the end of the while loop we get x = 12, reverse = 123
         * Since the middle digit doesnt matter in palindrome(always equal to itself) we can get rid of it
         */ 
        return x == reverse || x == reverse/10;
    }
}
