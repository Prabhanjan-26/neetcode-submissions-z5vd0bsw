class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int newArraySize=2*n;
        int[] ans=new int[newArraySize];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        int ansArrayLength=n;
        
        for(int j=0;j<n;j++){
            ans[ansArrayLength]=nums[j];
            ansArrayLength++;
        }

        return ans;
    }
}