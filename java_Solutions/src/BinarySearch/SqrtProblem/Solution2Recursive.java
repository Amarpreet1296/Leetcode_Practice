package BinarySearch.SqrtProblem;

public class Solution2Recursive {

    public int mySqrt(int x) {

        if(x == 0 || x == 1) return x;
        int left = 1, right = x/2; // left =1 to avoid Divisionby0 error
        return RecursiveSolution(left, right, x);
    }

    private int RecursiveSolution(int left, int right, int x) {

        //base case
        if(left > right) {return right;}

         int mid = left + (right - left)/2;

         long square = (long) mid * mid;

         if (square == x) return mid;
         else if (square < x) return RecursiveSolution(mid+1, right, x);
         else return RecursiveSolution(left, mid-1, x);



    }

}
