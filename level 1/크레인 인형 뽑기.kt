class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val stack = mutableListOf<Int>()

        moves.forEach {
            for(j in board[it-1].indices){
                if (board[j][it-1]!=0) {
                    println(board[j][it-1])
                    stack.add(board[j][it-1])
                    if(stack.size>1){
                        if(stack[stack.size-1]==stack[stack.size-2]) {
                            stack.removeAt(stack.size-1)
                            stack.removeAt(stack.size-1)
                            answer+=2
                        }
                    }
                    board[j][it-1]=0
                    break
                }
            }


        }

        return answer
    }
}