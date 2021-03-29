class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        for(i in s) {
            if(i.toInt()==32) {
                answer+=i
                continue
            }
            if((i.toInt()+n>90&&i.toInt()<91)||(i.toInt()+n>122&&i.toInt()<123))
                answer+= (i.toInt()-26+n).toChar()
            else
                answer+=(i.toInt()+n).toChar()

        }
        return answer
    }
}