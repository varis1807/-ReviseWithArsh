import java.util.*;

//Que-->>> https://www.geeksforgeeks.org/distributing-m-items-circle-size-n-starting-k-th-position/
public class DistributingMItemInCircleSizeNSrtFromKthPosition {
      public static int lastPosition(int n, int m, int k) {
            if (m <= n - k + 1)
                  return m + k - 1;
            m = m - (n - k + 1);
            return (m % n == 0) ? n : (m % n);
      }
}