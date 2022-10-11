package Easy.RomanToInteger;

import java.util.Map;
import java.util.HashMap;

/**
 * Submitted 09/08/2022
 * 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I            1
 * V            5
 * X            10
 * L            50
 * C            100
 * D            500
 * M            1000
 * 
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * Roman numerals are usually written largest to smallest from left to right. 
 * However, the numeral for four is not IIII. Instead, the number four is written as IV. 
 * Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

 * Given a roman numeral, convert it to an integer.
 * 
 * 
 * Time: O(n) - looping through string
 * Space: O(1) - hashmap
 */

public class romanToIntegerOptimalSolution {
    public static void main(String[] args) {
        /**
         * Example 1:
         * input: s = "III"
         * output: 3
         * Explanation: III = 3
         */
        String s = "III";
        System.out.println(RomanToInteger(s));

        /**
         * Example 2:
         * input: s = "LVIII"
         * output: 58
         * Explanation: L = 50, V = 5, III = 3
         */
        s = "LVIII";
        System.out.println(RomanToInteger(s));

        /**
         * Example 3:
         * input: s = "MCMXCIV"
         * output: 1994
         * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4
         */
        s = "MCMXCIV";
        System.out.println(RomanToInteger(s));
        
    }

    public static int RomanToInteger(String s) {
        // Creating a map to store values of roman numerals
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // Int for output
        int output = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            // Check if the current numeral is leass than the next one
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                // If it is then subtract them (ex. CM is 1000 - 100 so 900)
                output -= map.get(s.charAt(i));
            } else {
                // If it isnt then add them (ex. VI is 5 + 1 so 6)
                output += map.get(s.charAt(i));
            }
        }
        // Add the last numeral and return
        return output + map.get(s.charAt(s.length()-1));
    }
}
