class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = Array<IntArray>(arr1.size){i->
            Array<Int>(arr1[0].size){j->
                arr1[i][j]+arr2[i][j]
            }.toIntArray()
        }


        return answer
    }
}