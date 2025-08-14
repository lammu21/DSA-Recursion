// User function Template for Java

class Solution {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K)
    {
        // code here
        // int n = arr.length-1;
        
        return helperFunc(0,N,arr,K);
    }
    
    public static boolean helperFunc(int i ,int N,int [] arr,int k)
    {
        
        if(k == 0)
        {
            // since we will substract k with arr[i] elements, at any time k == 0 , then we found a subsequence
            return true;
        }
        
        if(k < 0)
        {
            // since we will substract k with arr[i] elements, at any time k < 0 , then we dont have subsequence with target K 
            
            return false; 
            
        }
        if(i == N)
        {
            // if Index is equals to len of arr, then if k==0 true we found subsequence with target k 
            // if not then flase
            
            return k ==0;
            
        }
        
        return helperFunc(i+1,N,arr,k-arr[i]) || helperFunc(i+1,N,arr,k);
    }
}
