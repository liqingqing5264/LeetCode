/***
 * 
 * 334. Increasing Triplet Subsequence
 * 
 * Medium
 * 
 * Given an unsorted array return whether an increasing subsequence of length 3
 * exists or not in the array.
 * 
 * Formally the function should:
 * 
 * Return true if there exists i, j, k
 * 
 * such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return
 * false.
 * 
 * Note: Your algorithm should run in O(n) time complexity and O(1) space
 * complexity.
 * 
 * Example 1:
 * 
 * Input: [1,2,3,4,5]
 * 
 * Output: true
 * 
 * Example 2:
 * 
 * Input: [5,4,3,2,1]
 * 
 * Output: false
 */

public class IncreasingTripletSubsequence {
	public boolean increasingTriplet(int[] nums) {
		int big = Integer.MAX_VALUE;
		int small = Integer.MAX_VALUE;
		for (int n : nums) {
			if (n <= small) {
				small = n;
			} else if (n <= big) {
				big = n;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		IncreasingTripletSubsequence test = new IncreasingTripletSubsequence();
		System.out.print(test.increasingTriplet(nums));
	}
}
