class Solution {
    fun solution(s: String): String {
        var answer = StringBuilder()
        val words =s.split(" ")
        for(i in words.indices){
            for(j in 0 until words[i].length){
                if(j==0)
                    answer.append(words[i][j].toUpperCase())
                else
                    answer.append(words[i][j].toLowerCase())
            }
            if(i==words.size-1)
                break
            answer.append(' ')
        }
        return answer.toString()

    }
}