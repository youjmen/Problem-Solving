package graph

import java.util.*

var infected = -1
fun main() = with(Scanner(System.`in`)){
    val computerSize =nextInt()
    val visited = MutableList(computerSize){false}
    val computers = MutableList(computerSize){ mutableListOf<Int>()}

    for (i in 0 until nextInt()){
        val node1 =nextInt()
        val node2 =nextInt()
        computers[node1-1].add(node2)
        computers[node2-1].add(node1)
    }
    findInfectedComputer(computers,1,visited)
}
fun findInfectedComputer(graph: MutableList<MutableList<Int>>,node :Int,visited: MutableList<Boolean>){
    if (visited[node-1])
        return
    println(node)
    infected++
    visited[node-1] = true
    graph[node-1].forEach {
        println(graph[node-1])
        findInfectedComputer(graph,it,visited)
    }
}