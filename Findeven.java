class Solution {
    public int findNumbers(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length;i++){
        int r=0;
        int temp=nums[i];
        while(temp>0){
            r++;
            temp/=10;
        }
       if(r%2==0){
        count++;
       }
     
    }
}
}