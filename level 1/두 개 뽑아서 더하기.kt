class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        for(i in numbers.indices){
            for(j in i+1 until numbers.size){
                if(!answer.contains(numbers[i]+numbers[j]))
                    answer.add(numbers[i]+numbers[j])

            }
        }
        answer.sort()
        return answer.toIntArray()
    }
}