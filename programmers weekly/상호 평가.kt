import java.lang.StringBuilder

class Solution2 {
    fun solution(scores: Array<IntArray>): String {
        var answer = StringBuilder()
        for (i in scores.indices) {
            val evaluateScore = mutableListOf<Int>()
            for (j in scores[i].indices) {
                evaluateScore.add(scores[j][i])
            }
            val maxScore = evaluateScore.max()
            val minScore = evaluateScore.min()
            if (evaluateScore.indexOf(maxScore) == i) {
                evaluateScore.remove(maxScore)
                if (evaluateScore.contains(maxScore)) {
                    evaluateScore.add(maxScore!!)

                }
            }
            else if (evaluateScore.indexOf(minScore) == i) {
                evaluateScore.remove(minScore)
                if (evaluateScore.contains(minScore)) {
                    evaluateScore.add(minScore!!)

                }

            }

            answer.append(calculateCredit(evaluateScore.sum().toFloat() / evaluateScore.size))

        }

        return answer.toString()
    }
    private fun calculateCredit(average : Float) : String{
        when {
            average>=90 -> {
                return "A"
            }
            average>=80 -> {
                return "B"
            }
            average>=70 -> {
                return "C"
            }
            average>=50 -> {
                return "D"
            }
            else -> {
                return "F"
            }
        }


    }
}
fun main(){
    val a = Solution2()
    println(a.solution(arrayOf(intArrayOf(50,90), intArrayOf(50,87))))

}