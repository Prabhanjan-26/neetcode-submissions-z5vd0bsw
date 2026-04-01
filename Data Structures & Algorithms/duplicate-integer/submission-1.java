class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=nums.length;
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        for (int num : mp.values()) {
            if (num > 1) {
                return true;
            }
        }
        return false;
    }
}