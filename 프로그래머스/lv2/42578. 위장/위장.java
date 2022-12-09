import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        // 종류 : 개수
        HashMap<String, Integer> hm = new HashMap<>();


        for(int i=0; i<clothes.length; i++) {
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1],0)+1); 
        }

        // 경우의 수 체크 answer *= (옷 가지수 + 안 입을 경우)
        for(int val : hm.values()) {
          answer *= (val+1);
        }
        
        return answer-1;
    }
}