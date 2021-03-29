class Solution {
    fun solution(a: Int, b: Int): String {
        var day : Array<String> = arrayOf("SUN","MON","TUE","WED","THU","FRI","SAT")


        var month : Array<Int> = arrayOf(31,29,31,30,31,30,31,31,30,31,30)
        var answer = day[daycalculate(a,b,month)]
        return answer
    }
    fun daycalculate(month : Int, day: Int,arr : Array<Int>) : Int{
        var daySum : Int =0
        if(month>1){
            for(i in 0..month-2){
                daySum += arr[i]

            }
        }
        return (daySum+day+4)%7

    }
}