class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=nums.length;
        int ans=0;
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            int val = entry.getValue();
            if(val>n/2){
                ans=entry.getKey();
            }
        }
        return ans;
    }
}