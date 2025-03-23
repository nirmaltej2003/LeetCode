class Solution {
    public int reverse(int x) 
    {
        int res=0;
        while(x!=0)
        {
            int rem=x%10;
             if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10)
              {
                return 0;
              }
            res=res*10+rem;
            x=x/10;
        }
        System.out.println("Result:"+res);
        return res;
    }
}