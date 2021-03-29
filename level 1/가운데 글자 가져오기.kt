class Solution {
    fun solution(s: String): String {
        var answer : String = ""
        if(s.length%2==0){
            answer += s[s.length/2-1].toString()+s[s.length/2].toString()
        }
        else{
            answer +=s[s.length/2].toString()
        }

        return answer
    }
}