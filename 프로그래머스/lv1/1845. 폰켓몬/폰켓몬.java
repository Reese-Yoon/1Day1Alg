import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        
        int limit = nums.length/2;
        
        HashSet<Integer> hashset = new HashSet<>();
        for(int num:nums) hashset.add(num);
        
        // 폰켓몬 종류의 개수 최댓값
        int answer = hashset.size();
        
        if(limit < hashset.size()) return limit;
                
        return answer;
    }
}