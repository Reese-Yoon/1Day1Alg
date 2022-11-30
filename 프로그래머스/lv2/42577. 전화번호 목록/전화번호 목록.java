import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {

        HashMap<String, Integer> hm = new HashMap<>();
        
        // 배열 전체를 hashmap에 담아 둔다.
        for(int i=0; i<phone_book.length; i++){
            hm.put(phone_book[i], i);
        } 
        
        // 반복문과 subString을 이용하여 비교한다.
        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length(); j++){
                if(hm.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }   
        
        return true;
    }
}