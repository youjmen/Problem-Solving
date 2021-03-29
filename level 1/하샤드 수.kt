class Solution {
    fun solution(x: Int): Boolean {
        var z= x
        var answer = false
        var a= arrayOf<Int>(0,0,0,0,0)
        var cnt =0
        while(true){
            a[cnt]=z%10
            if(z/10==0)
                break


            z=z/10
            cnt++
        }
        if(x%(a[0]+a[1]+a[2]+a[3]+a[4])==0)
            answer = true


        return answer
    }
}