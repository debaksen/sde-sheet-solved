class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        
        // STEP 1 : run a loop through the array and  for each val encounter 
        // mark it's subsequent index as nagative 
        
        // say encounted -> 4 --> mark nums[index[3]] as -ve i.e 
        // [4,3,2,7,8,2,3,1]
        //[4,3,2,-7,8,2,3,1
        
        //[-4,+3,-2,+7,8,2,-3,-1]       
        
        // likewise repeate this process for the entire array and while  traversing makesure to use the 
        // index = mod(nums[i]) - 1 to instead of nums[i] - 1 to handle the nagative index outofbounds case
        
        // now if ther's any duplicate elements  avaliable in the array it will be marked +ve (two times nagative)
        
    
        
        List<Integer> list = new ArrayList<>();
        if(nums.length == 0) return list;
        
        int currIndex = 0;
        for(int i=0;i<nums.length;i++){
            
            currIndex = Math.abs(nums[i]) - 1;
            nums[currIndex] = -nums[currIndex];
            
            if(nums[currIndex] > 0)
                list.add(currIndex+1);      
        }
        
        return list;
        
    }
}
