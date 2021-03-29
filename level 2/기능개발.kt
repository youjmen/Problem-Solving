class Solution3{
    fun solution(progresses: IntArray, speeds: IntArray): IntArray{

        var answer = mutableListOf<Int>()

        var progressCount =0

        while(progressCount!=progresses.size) {

            var completedProgress = 0
            for (i in 0..progresses.lastIndex) {
                progresses[i]+=speeds[i]

            }


            if(progresses[progressCount]>=100){

                for (i in progressCount..progresses.lastIndex) {
                    if(progresses[i]>=100){
                        completedProgress+=1
                    }
                    else break
                }

                answer.add(completedProgress)
                progressCount+=completedProgress

            }

        }




        return answer.toIntArray()
    }
}