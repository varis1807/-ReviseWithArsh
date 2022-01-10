import java.util.*;

// Que-->> https://practice.geeksforgeeks.org/problems/count-ways-to-nth-stairorder-does-not-matter1322/1/
public class CountWaysToNthStair {
      Long countWays(int m) {
            Long ways = 0L;
            for (int i = 0; i <= m; i++) {
                  ways++;
                  m--;
            }
            return ways;
      }
}
