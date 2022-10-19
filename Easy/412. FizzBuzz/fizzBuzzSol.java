import java.util.ArrayList;
import java.util.List;

/**
 * Submitted: 09/10/2022
 * 
 * Given an integer n, return a string array answer (1-indexed) where:
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * 
 * Constraints:
 *      1 <= n <= 104
 * 
 * Time: O(n)
 * Space: O(1)
 */
public class fizzBuzzSol {
    public static void main(String[] args) {
        
    }

    public static List<String> fizzBuzz(int n) {
        List<String> strings = new ArrayList<>();
        
        for (int i = 0; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) strings.add("FizzBuzz");
            else if(i % 3 == 0) strings.add("Fizz");
            else if(i % 5 == 0) strings.add("Buzz");
            else strings.add(Integer.toString(i));
        }

        return strings;
    }
}
