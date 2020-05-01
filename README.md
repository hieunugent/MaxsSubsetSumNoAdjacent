# MaxsSubsetSumNoAdjacent
- the function will take in an array of positive integers and return the maximum sum of non- adjacent elemnt in the array.
- if the sum can be generate return 0
# Solution
- create an array used to hold the maximum of no adjacent that could be 
- the current maximumArray potential value is maximum between the previous adjacent and non previous adjacent
- the first two index of maximumArray will be pre-define before the loop, the first maximumArray index is the first array index
- the seconds maximumArray is max of (zero, first index)
- starting the loop and consider to get maximumArray[i-1], and maximumArray[i-2]+array[i]
- after loop return the value of last index of maximumArray.

