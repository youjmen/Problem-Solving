class Solution {
    fun solution(s: String): String {
        var answer =""
        var cnt =0

        for(i in s){

            if(cnt%2==0)
                answer+=i.toUpperCase()
            else
                answer+=i.toLowerCase()
            if(i.toString()==" ")
                cnt=0
            else
                cnt++

        }
        return answer
    }
}