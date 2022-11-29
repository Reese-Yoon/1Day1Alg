class Solution {
    public int solution(int num1, int num2) {
        
        float result = 0;
        result = (float) (num1*1.0000) / num2;
        
        return (int)Math.floor(result * 1000);
    }
}