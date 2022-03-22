class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var first = 0
        var last = 1
        while(true){
            if(nums[first]+nums[last] == target){
                return intArrayOf(first,last)
            }
            else if(last < nums.lastIndex){
                last++
            }
            else{
                first+=1
                last = first+1
            }
        }
    }
}