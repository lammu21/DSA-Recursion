class Solution {


    // Recursive Approach 
    public List<List<Integer>> subsets(int[] nums) {
   
         
        //  Ans to store all Subset
         List<Integer> current = new ArrayList<>();

        //   Current is to store Current Subset
         List<List<Integer>> ans = new ArrayList<>();

         
        //  My Mistake:  should return backtrack, cause it returns void
        // return backtrack(0,nums.length,nums,current,ans);
        
        backtrack(0,nums.length,nums,current,ans);
        return ans;
        
    }

    public static void backtrack(int ind,int len,int [] nums,List<Integer>current,List<List<Integer>> ans)
    {
        if(ind==len)
        {
            // Mistake 2: Should Store Current Directly 
            // Should Create new ArrayList and add it ans 
            // ans.add(newcurrent);

             ans.add(new ArrayList<>(current));
            return;
        }

        // Not picking current ind case 

        backtrack(ind+1,len,nums,current,ans);


        // picking current ind case 
         current.add(nums[ind]);
        backtrack(ind+1,len,nums,current,ans);

        // Removing last element after considering picking current ind ,
        // we need go for other case where current ind will not be Consider 
        current.remove(current.size()-1);

        
        
        
    }
}