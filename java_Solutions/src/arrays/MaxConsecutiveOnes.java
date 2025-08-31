package arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentVal = 0;
        int maxSum= 0;
        /**
         * For each index if 1 add to currentVal
         * return the max of CurrentVall || maxSum
         */

        for (int num : nums) {
            currentVal =  (num == 1) ? currentVal+1 : 0;
            maxSum = (currentVal > maxSum) ? currentVal : maxSum;

        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes mc = new MaxConsecutiveOnes();
        int[] nums = {1,1,1,0,1,1};
        System.out.println(mc.findMaxConsecutiveOnes(nums));
    }

}
