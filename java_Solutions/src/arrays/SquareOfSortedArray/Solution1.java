package arrays.SquareOfSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution1 {

    /**
     * N*N FOR each num
     * And we return the sprted ary
     */


    public ArrayList<Integer> sortedArray(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();

        for( int num : nums ) {
            res.add(num * num);
            Collections.sort(res);
        }

        return res;
    }

    //testing
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = new int[] {1,-2,31,4,5,6,7,8,9,10};
        System.out.println(s.sortedArray(nums));
    }
}
