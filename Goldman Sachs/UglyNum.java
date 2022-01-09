import java.util.*;

//Que-->>> https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/
public class UglyNum {
      long getNthUglyNo(int n) {
            int i2 = 0, i3 = 0, i5 = 0;
            long[] ugly = new long[n];
            ugly[0] = 1;
            long next_ugly = 1;
            long nm2 = 2, nm3 = 3, nm5 = 5;
            for (int i = 1; i < n; i++) {
                  next_ugly = Math.min(nm2, Math.min(nm3, nm5));
                  ugly[i] = next_ugly;
                  if (next_ugly == nm2) {
                        i2++;
                        nm2 = ugly[i2] * 2;
                  }

                  if (next_ugly == nm3) {
                        i3++;
                        nm3 = ugly[i3] * 3;

                  }
                  if (next_ugly == nm5) {
                        i5++;
                        nm5 = ugly[i5] * 5;
                  }
            }

            return next_ugly;

      }
}
