package graph

import java.util.*

fun main() {
    println(Solution.solution(3, arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 0), intArrayOf(0, 0, 1))))
    println(Solution.solution(3, arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 1), intArrayOf(0, 1, 1))))

}

class Solution {
    companion object {
        fun solution(n: Int, computers: Array<IntArray>): Int {
            val visited = MutableList(n){false}
            val allVisited = MutableList(n){true}
            val queue: Queue<Int> = LinkedList()
            queue.offer(0)
            var cnt =0
            var networks = 0
            while (visited!=allVisited) {
                queue.offer(visited.indexOf(false))
                findNetwork(queue, visited, computers)
                networks++

                cnt++
                if (cnt>=n)
                    cnt=0
            }
            return networks
        }
        fun findNetwork(queue: Queue<Int>, visited : MutableList<Boolean>,computers: Array<IntArray>){
            while (queue.isNotEmpty()) {
                val x = queue.poll()
                visited[x]=true
                for (y in computers[x].indices){
                    if (computers[x][y]!=0) {
                        if (!visited[y]) {
                            queue.offer(y)
                            visited[y]=true
                        }
                    }
                }
            }
        }
//        fun solution(n: Int, computers: Array<IntArray>): Int {
//
//            val networkComputers : MutableList<IntArray> = computers.toMutableList()
//            var networks = 0
//            for (i in 0 until n) {
//                for (j in 0 until n) {
//                    if (findNetwork(networkComputers, i, j))
//                        networks++
//                }
//            }
//            return networks
//        }
//        fun findNetwork(computers: MutableList<IntArray>,x:Int,y:Int) : Boolean{
//            if (x<0||x>=computers.size||y<0||y>=computers.size)
//                return false
//
//            if (computers[x][y]==1){
//                computers[x][y]=0
//                findNetwork(computers,x-1,y)
//                findNetwork(computers,x+1,y)
//                findNetwork(computers,x,y-1)
//                findNetwork(computers,x,y+1)
//                return true
//
//            }
//            return false
//        }
    }

}