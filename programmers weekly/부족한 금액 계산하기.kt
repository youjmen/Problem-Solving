class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {

        var priceSum : Long = 0
        for (i in count downTo 1){
            priceSum+=price * i
        }

        return if(money> priceSum)
             0
        else
             (priceSum - money)
    }
}
fun main(){
    val a = Solution()
    println(a.solution(3,20,4))
}