package arrays101.DuplicateZeros;

public class Solution_2_Counting_Zeros {

    /**
     * Traverse and count zeros and
     * fill array from R -> L
     * Time O(n)
     */

    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        for (int i: arr){
            if(arr[i] == 0){
                zeros ++;
            }
        }

        int writeIndex = n + zeros -1; // image if we were out of bounds in our list

        for(int readIndex = n-1; readIndex >= 0; readIndex--){ //start from the end of current list

            if (writeIndex < n) {
                arr[writeIndex] = arr[readIndex];
            }
            if (arr[readIndex] == 0) {
                writeIndex--;
                if (writeIndex < n) {
                    arr[writeIndex] = 0; // duplicate zero
                }
            }
            writeIndex--;
        }
    }

    public static void main(String[] args) {
        Solution_2_Counting_Zeros sol = new Solution_2_Counting_Zeros();
        sol.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }
}
