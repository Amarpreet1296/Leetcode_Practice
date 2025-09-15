package arrays101.MoveZeroes;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for(int right = 0; right < nums.length; right++){

            if (nums[right] != 0) {
                if(left != right){ //then we swap the values

                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;

                }

                left++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes m = new MoveZeroes();
        int[] nums1 = new int[]{0,1,0,3,12};
        System.out.println("Before: " + Arrays.toString(nums1));
        m.moveZeroes(nums1);
        System.out.println("After:  " + Arrays.toString(nums1));

        System.out.println();
    }
}

