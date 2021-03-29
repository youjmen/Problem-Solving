class Solution {
    fun solution(seoul: Array<String>): String {
        var answer ="김서방은 "
        for(i in 0..seoul.lastIndex){
            if(seoul[i]=="Kim")
                answer= answer.plus(i.toString()+"에 있다")
        }

        return answer
    }
}