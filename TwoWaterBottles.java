class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles;  
        int empty = numBottles;  

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;   
            drank += newBottles;                    
            empty = empty % numExchange + newBottles; 
        }

        return drank;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numWaterBottles(9, 3));   
        System.out.println(s.numWaterBottles(15, 4));  
    }
}
