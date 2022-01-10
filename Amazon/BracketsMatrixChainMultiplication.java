import java.util.*;

//Que-->>>> https://practice.geeksforgeeks.org/problems/brackets-in-matrix-chain-multiplication1024/1/
public class BracketsMatrixChainMultiplication {
      public static String mcm_Dp(int[] arr, int SI, int EI, int[][] dp) {
            int n = arr.length;
            String[][] sdp = new String[n][n];
            for (int gap = 1; gap < n; gap++) {
                  for (int si = 0, ei = gap; ei < n; si++, ei++) {
                        if (ei - si == 1) {
                              dp[si][ei] = 0;
                              sdp[si][ei] = (char) (si + 'A') + "";
                              continue;
                        }
                        int minRes = (int) 1e9;
                        String minStr = "";
                        for (int cut = si + 1; cut < ei; cut++) {
                              int leftRes = dp[si][cut];
                              int rightRes = dp[cut][ei];

                              if (leftRes + arr[si] * arr[cut] * arr[ei] + rightRes < minRes) {
                                    minRes = leftRes + arr[si] * arr[cut] * arr[ei] + rightRes;
                                    minStr = "(" + sdp[si][cut] + sdp[cut][ei] + ")";
                              }
                        }
                        dp[si][ei] = minRes;
                        sdp[si][ei] = minStr;
                  }
            }
            return sdp[SI][EI];
      }

      static String matrixChainOrder(int p[], int n) {
            // code here
            int[][] dp = new int[n][n];
            return mcm_Dp(p, 0, n - 1, dp);
      }
}
