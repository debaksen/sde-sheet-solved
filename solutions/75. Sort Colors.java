class Solution {
    public void sortColors(int[] nums) {
        
        int lo = 0;
        int hi = nums.length-1;
        int mid = lo;
        
       while(mid <= hi){
           
        if(nums[mid] == 0){
​
            swap(nums,lo,mid);
            mid++;
            lo++;
            continue;
           
        }
            
        if(nums[mid] == 1){
            mid++;
            continue;
        }
           
        if(nums[mid] == 2){
            swap(nums,mid,hi);
            hi--;
           continue;
        }
       }
    }
    
    private void swap(int[] nums, int a, int b){
        int temp  = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    //[1,2,0]
    //0 2 1
    //
}
