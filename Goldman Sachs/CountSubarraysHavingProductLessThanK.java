import java.util.*;
//Que-->> https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/#
public class CountSubarraysHavingProductLessThanK {
      public int countSubArrayProductLessThanK(long a[], long n, long k)
      {
          long answer=1;
          int count=0;
          int i=0;
          int j=0;
         while(j<n)
         {
             answer*=a[j];
            while(answer>=k&&i<n)
            {
                answer=answer/a[i];
                i++;
            }
            count+=j-i+1;
            j++;
         }
         return count;
  
      }  
}
