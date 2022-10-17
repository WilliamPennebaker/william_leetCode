
/**
 * Submitted: 09/09/2022
 * 
 * Given two binary strings a and b, return their sum as a binary string.
 * 
 * Constraints:
 *      1 <= a.length, b.length <= 104
 *      a and b consist only of '0' or '1' characters.
 *      Each string does not contain leading zeros except for the zero itself.
 * 
 * 
 */

public class addBinarySol {
    
    public static void main(String[] args) {
        /**
         * Example 1
         * input: a = "11", b = "1"
         * output: "100"
         */

        /**
         * Example 2
         * input: a = "1010", b = "1011"
         * output: "10101"
         */
    }

    /**
     * 
     */
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1; // Counter for first String
        int j = b.length() - 1; // Counter for second String
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if(i >= 0) sum += a.charAt(i) - '0'; // - '0' converts char to int
            if(j >= 0) sum += b.charAt(j) - '0';
            sb.append(sum % 2); // If sum == 2 or 0 append 0 since 1+1=0 in this case as this is base 2 (just like 1+9 is 0 if adding ints in columns)
            carry = sum / 2; // If sum == 2 we have a carry, else no carry 1/2 rounds down to 0 in integer arithematic

            // Deincrement
            i--;
            j--;
        }

        if(carry != 0) sb.append(carry); // Incase of a 1 at the end on carry

        return sb.reverse().toString(); // Since sb adds to the end, our sb would be 001 if we wanted 100 so we have to reverse it
    }
}
