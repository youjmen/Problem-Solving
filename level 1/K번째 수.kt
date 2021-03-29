fun main(){
    var a = intArrayOf(1,5,2,6,3,7,4)
    var arr = arrayOf<IntArray>(intArrayOf(2,5,3),intArrayOf(4,4,1),intArrayOf(1,7,3))
    var b = k()
    b.solution(a,arr)

}
class k {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()
        var arr = mutableListOf<IntArray>()
        println("z커맨드"+commands[2][2])
        println("사이즈"+commands.size)
        println("마지막인덱스"+commands.lastIndex)
        for(i in 0..commands.lastIndex){
            var tempArr = mutableListOf<Int>()
            for(j in commands[i][0]..commands[i][1]){
                tempArr.add(array[j-1])

            }
            tempArr.sort()

            arr.add(tempArr.toIntArray())

        }
        for(a in 0..arr.lastIndex){
            for(b in 0..arr[a].lastIndex) {
                println("a : $a")
                println("b : $b")
                println(arr[a][b])
            }
            println()
        }
        for(i in 0..commands.lastIndex){

            answer.add(arr[i][commands[i][2]-1])

        }






        return answer.toIntArray()
    }
}