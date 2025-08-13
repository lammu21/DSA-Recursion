class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {

        // to return all the combinationSum
        List<List<Integer>> ans = new ArrayList<>();
        
        // To store Current Recursion List
        List<Integer> current = new ArrayList<>();

        int n = candidates.length-1;

        //  Helper which does Recursion
        combSumHelper(n,candidates,target,current,ans);
        
        return ans;
    }

    public static void combSumHelper(int n, int[]cand,int tar,List<Integer> cur,List<List<Integer>> ans )
    {
          if(tar == 0)
          {
            ans.add(new ArrayList<>(cur));
            return;
          }
          if(n < 0 || tar < 0)
          {
            return;
          }

        //   if(n == 0)
        //   {
        //     return tar==0;
        //   }

        //   Not pick Recursion 
          
        combSumHelper(n-1,cand,tar,cur,ans);

        //   Pick Recursion
        cur.add(cand[n]);

        combSumHelper(n,cand,tar - cand[n],cur,ans);

        cur.remove(cur.size()-1);
    }
}