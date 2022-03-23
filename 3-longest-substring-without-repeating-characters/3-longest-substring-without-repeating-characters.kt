class Solution {
    // 로직 구상을 하다가 중간에 풀리지 않아 솔루션을 봄. 슬라이딩 윈도우를 통해 푸는 문제
// 브루트 포스로 작성 시 O(N^3)이 걸린다.
    fun lengthOfLongestSubstring(s: String): Int {
    var left = 0
    var right = 0
    var result = 0
    val subStringLengthList = IntArray(128){0}
    while (right < s.length){
        val char = s[right]
        subStringLengthList[char.toInt()]++
        while (subStringLengthList[char.toInt()]>1){
            val l = s[left]
            subStringLengthList[l.toInt()]--
            left++
        }
        val size = right - left + 1
       
        result = Math.max(result, size)
        right++
    }
    return result

    }
}