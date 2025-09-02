package arrays101.CountEvenNumberOfDigits;

public class Solution2LogConversion {


    /***
     * Traverse through the array
     * num of digits =  e.g log10(9) = 0.955 and then use (INT)Manth.log10(9) = 0, then add 1
     * @param nums
     * @return
     *
     * Time and space complexity = O (n) , O(1)
     */

    public int findEvenNumDigits(int[] nums) {

        int evenNumDigits = 0; // 0(1)

        for (int num : nums) {      //O(n)
            // edge case if num == 0

            if (num == 0) {
                evenNumDigits = 1;
            } else {

                evenNumDigits = (((int) Math.log10(num) + 1) % 2 == 0) ? evenNumDigits + 1 : evenNumDigits;
            }
        }

        return evenNumDigits;
    }
}
