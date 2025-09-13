package arrays101.ReplaceWithGreatest;

public class ReplacWithGreatestElement {

    public int[] replaceElements(int[] arr) {

        //rightmostmax = -1

        int maxFromRight = -1;

        for (int i = arr.length-1; i >= 0; i--) {

            int current = arr[i];
            arr[i] = maxFromRight;
            maxFromRight = Math.max(maxFromRight, current);
        }
        return arr;

    }
}
