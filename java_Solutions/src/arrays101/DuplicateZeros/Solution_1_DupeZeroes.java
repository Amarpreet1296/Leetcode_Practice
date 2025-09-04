package arrays101.DuplicateZeros;

public class Solution_1_DupeZeroes {

    public void duplicateZeros(int[] arr) {
        /**
         *  BRUTE FORCE
         *  find the length of arr
         * Traverse find 0 and then shift the rest by 1
         * Then add another zero to the vacant index.
         *
         * Time O(n * n)
         */

        int len = arr.length;
        for (int i = 0; i < len; i++) {

            if (arr[i] == 0) {
                //We want to start moving from the back one item less
                for (int j = len - 1; j>i; j-- ) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Solution_1_DupeZeroes solution = new Solution_1_DupeZeroes();
        solution.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }

    }
