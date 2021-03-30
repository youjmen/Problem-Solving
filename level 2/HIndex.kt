package sort

fun main(){
//    println(solution(intArrayOf(3, 0, 6, 1, 5)))
//    println(solution(intArrayOf(47,42,32,28,24,22,17,15,10,10,8)))
    println(solution(intArrayOf(3,3,3,0,0,0,0)))
    println(solution(intArrayOf(3,0,6,1,5)))
    println(solution(intArrayOf(0,0,0)))
}
fun solution(citations: IntArray): Int {
    val list = citations.toMutableList()
    list.sortDescending()
    var sum = 0
    var answer = 0
    for(i in list.max()!! downTo 0){
        for(j in list.indices){
            if (list[j]>=i) {
                sum++
            }
            if (sum>=i)
                break
        }

        if (sum>=i){
            answer = i
            break
        }
        sum =0
    }
    return answer
}