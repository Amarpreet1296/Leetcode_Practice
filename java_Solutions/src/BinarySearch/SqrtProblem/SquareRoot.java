package BinarySearch.SqrtProblem;

public class SquareRoot {

    public  int sqrt(int x) {
        /**
         * Think of x as number on a x axis
         * The sqrt of x cannot be > x/2
         * So we use binary to search find the mid
         * if the mid * mid < x we move left pointer 1 ahead
         *
         */
        if (x == 0 || x == 1) return x;

        int left = 0;
        int right = x/2;
        while(left <= right){
            int mid = left + (right - left)/2;

            if(mid  == x/mid && x % mid == 0 ) { // not usinf mid * mid to preven overflow
                return mid;
            }
            else if(mid < x/mid) {
                left = mid +1 ;
            }
            else  {
                right = mid - 1;
            }
        }
        // when loop exits L > R
        return  right;


    }
}
