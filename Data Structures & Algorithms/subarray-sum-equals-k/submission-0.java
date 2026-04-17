class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int res=0;
        int currentSum=0;

        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            
            if(currentSum==k){
                res++;
            }

            if(mp.containsKey(currentSum-k)){
                res+=mp.get(currentSum-k);
            }
            mp.put(currentSum,mp.getOrDefault(currentSum,0)+1);
        }
        return res;
    }
}