import java.util.*;

// Que-->> https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126/1
public class NumberFollowingPattern {
      static String printMinNumberForPattern(String S) {
            // code here
            Stack<Integer> st = new Stack<>();
            String ss = "";
            for (int i = 0; i <= S.length(); i++) {
                  st.push(i + 1);
                  if (i == S.length() || S.charAt(i) == 'I') {
                        while (st.size() > 0) {
                              ss += String.valueOf(st.pop());
                        }
                  }
            }
            return ss;
      }
}
