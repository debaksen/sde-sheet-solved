class Solution {
    public int findDuplicate(int[] nums) {
    
        // Floyd cyclic methode O(n) Time |O(1) space
        int fastPointer = nums[0];
        int slowPointer = nums[0];
        
        fastPointer = nums[nums[fastPointer]];
        slowPointer = nums[slowPointer];
        
        while(fastPointer != slowPointer){
            fastPointer = nums[nums[fastPointer]];
            slowPointer = nums[slowPointer];
        }
        
        int a_pointer = nums[0];
        int b_pointer = slowPointer;
        
        while(a_pointer != b_pointer){
            a_pointer = nums[a_pointer];
            b_pointer= nums[b_pointer];
        }
        
        return a_pointer;
    }
    
// brute force approach methode O(n^2) Time | O(1) space
​
    private int findDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j])
                    return nums[i];
            }
        }
        return -1;
    }
​
//using Set/HashMap approach methode O(n)logn Time | O(n) space
    
    public int findDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])) set.add(nums[i]);
            else 
                return nums[i];
        }
        return -1;
    }
​
//using another boolen array approach methode O(n) Time | O(n) space
    
    public int findDuplicate(int[] nums) {
        
        boolean[] bool = new boolean[nums.length];
        Arrays.fill(bool,true);
        
        for(int i=0;i<nums.length;i++){
            if(bool[nums[i] - 1] == false) return nums[i];
            else 
                bool[nums[i]-1] = false;
        }
        return -1;
    }
    
}
