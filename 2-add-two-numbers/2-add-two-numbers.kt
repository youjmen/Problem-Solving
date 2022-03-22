/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
// 구상은 Approach 1: Elementary Math와 동일하게 했는데, listNode의 next 접근과 두 리스트의 길이가 다를시 어떻게 해야할 지 구상이 오래걸림(30분 초과)
// 리스트 길이가 다를시, null check를 하여 listNode가 null이면 0을 반환하게 한다.
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var firstList =l1 
        var secondList = l2
        var answerList = ListNode(0)
        var carry = 0
        var currentNode = answerList
        while(firstList !=null || secondList!= null){
            val first = firstList?.`val` ?: 0
            val second = secondList?.`val` ?: 0
            val sum = first+second+carry
            carry = sum /10
            currentNode.next = ListNode(sum%10)
            currentNode = currentNode.next
            if(firstList !=null){
                firstList = firstList.next
            } 
              if(secondList !=null){
                secondList = secondList.next
            }      
            
        }
        if(carry>0){
            currentNode.next = ListNode(carry)
        }
        return answerList.next
    }
}