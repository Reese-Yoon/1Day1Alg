import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        String diff = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for(String element:participant) hm.put(element, hm.getOrDefault(element,0)+1);
        for(String element:completion) hm.put(element, hm.get(element)-1);
        
        for(String key:hm.keySet()){
            if(hm.get(key)!=0){
                diff += key+"";
            }
        }    
        System.out.println(diff);
        
        return diff;
    }
}