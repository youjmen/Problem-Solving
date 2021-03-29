class Solution2 {
    fun solution(heights: IntArray): IntArray {
        var arrSize =heights.size
        for(i in heights.lastIndex downTo 0){
            arrSize-=1
            for(j in arrSize downTo 0){
                if(heights[i]<heights[j]){
                    heights[i]=j+1
                    break
                }
                if(j==0){
                    heights[i]=0
                }
            }
        }

        var answer =heights.toMutableList().toIntArray()
        for(i in 0..answer.lastIndex){
            println(answer[i])
        }

        return answer
    }
}