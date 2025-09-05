package arrays101.RemoveElement;

public class Solution1RemoveElement {

    public int removeElement(int[] nums, int val) {

        int len = nums.length;
        /**
         * we create 2 pointer at the start
         * one reads and finds the val
         * if val found shift the read to next and copy the non val
         * */
        int write = 0;
        for (int read = 0; read < len; read++) {
            if(nums[read] != val) {
                nums[write] = nums[read];
                write++;
            }
        }
        return write;

    }
}
