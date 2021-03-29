fun main(){
    var a =Solution5()
    var b = intArrayOf(7,4,5,6)
    a.solution(2,10,b)


}
class Solution5{
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int{
        var answer =0
        var crossedTruckCount =0
        var crossingTruckCount =0

        var crossedTrucks = mutableListOf<Int>()
        var crossingTrucks = mutableListOf<Int>()
        var truckRidedTime = mutableListOf<Int>()
        var crossingWeights=0
        var rided=false





       while(crossedTrucks.size<truck_weights.size){

           //시간 지나고 다리내리기
           answer+=1

           if(answer>1) {
               if (answer - truckRidedTime[crossedTruckCount] == bridge_length) {

                   crossedTrucks.add(crossingTrucks[crossedTruckCount])
                   crossingWeights -= crossingTrucks[crossedTruckCount]
                   crossedTruckCount++
                   crossingTruckCount--
                   println("내린시각" + answer)


                   println("사이즈" + crossedTrucks.size)

               }
           }
           println("지난 트럭"+crossedTruckCount+"지나는 트럭"+crossingTruckCount)




            //다리 위에 태우기


        if(crossedTruckCount+crossingTruckCount<truck_weights.size) {
            if (weight >= crossingWeights + truck_weights[crossingTruckCount + crossedTruckCount]) {

                truckRidedTime.add(answer)


                crossingTrucks.add(truck_weights[crossingTruckCount + crossedTruckCount])
                crossingWeights += truck_weights[crossingTruckCount + crossedTruckCount]
                crossingTruckCount++


            }
        }







        }



        return answer
    }
}