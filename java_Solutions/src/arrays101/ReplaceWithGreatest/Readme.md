# Replace Elements with Greatest Element on Right Side

## Problem Statement
Given an array arr, replace every element in that array with the greatest element among the elements to its 
right, and replace the last element with -1.

After doing so, return the array.



### Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation:
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
  Example 2:
### Example 2:
Input: arr = [400]
Output: [-1]
Explanation: There are no elements to the right of index 0.


Constraints:

1 <= arr.length <= 104
1 <= arr[i] <= 105

## Approach
We will start traversing from right to left, so we can keep track of the max
We have seen and replaced the current index values if we try from  left -> right
We need to run 2 loops to find the max and then replace it O(n * n). 

## Algorithm
- Start from the rightmost elem
- Keep track of `maxFromRight` initially `-1`
- For each elem, replace it with `maxFromRight` and update max.

## Time & Space Complex 

- **Time:** O(n) - Single pass
- **Space:** O(1)