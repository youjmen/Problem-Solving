class Solution {
    fun solution(num: Int): Int {
        var n=num
        var cnt =0
        while(n!=1){
            if(cnt==500) return -1
            when(n%2){
                0->{
                    n/=2
                }

                1->{
                    n=n*3+1
                }
            }
            cnt++
        }
        var answer = cnt
        return answer
    }
}