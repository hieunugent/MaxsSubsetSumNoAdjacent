class Solution {
  public static int maxSubsetSumNoAdjacent(int[] array) {
    // Write your code here.
		if(array.length == 0){
			return 0;
		}
		if(array.length == 1){
			return array[0];
		}
		if (array.length == 2){
			return Math.max(array[0], array[1]);
		}
		int[] maxSum= new int[array.length];
		maxSum [0] = array[0];
		maxSum [1] = Math.max(array[0], array[1]);
		for (int i = 2; i < array.length; i++ ){
			maxSum[i] = Math.max(maxSum[i-1], maxSum[i-2]+array[i]);
		}
		
    return maxSum[array.length -1] ;
  }
}
