class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> cur = new ArrayList<>();

        Arrays.sort(candidates);

        func(0,candidates,target,cur,ans);

        return ans;
        
    }
    void func(int i,int[] cand,int k,List<Integer> cur,List<List<Integer>> ans)
    {
        if(k == 0)
        {
            ans.add(new ArrayList<>(cur));
            return;
        }
        if(k < 0 || i == cand.length)
        {
            return;
        }

        cur.add(cand[i]);

        func(i+1,cand,k-cand[i],cur,ans);

        cur.remove(cur.size()-1);

        for(int j = i+1; j<cand.length; j++)
        {
            if(cand[j]!=cand[i])
            {
                func(j,cand,k,cur,ans);
                break;

            }


        }
         
    }
}