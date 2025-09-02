package arrays.CountEvenNumberOfDigits;

public class Solution1StringConversion {

    public int findNumbers(int[] nums) {
        /**
         * Traverse through each item
         * Covert them into strings
         * String.length % 2 == 0 hence Even
         * add to our count var
         *
         * Time O(n * d) d = avg num of digits.
         */
        int evenNumDigits = 0;     // O (1)

        for(int num :nums)  {       // O(n)

            evenNumDigits = (String.valueOf(num).length() % 2 == 0 ) ? evenNumDigits++ : evenNumDigits; //O(d* n)
        }
        return evenNumDigits;

    }
}
