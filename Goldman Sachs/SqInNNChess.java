import java.util.*;
//Que --->>> https://practice.geeksforgeeks.org/problems/squares-in-nn-chessboard1801/1#
//1
public class SquareInNNChess {
      public static long squaresInChessBoard(long N) {
            // code here
            if (N == 1)
                  return N;
            long ans = N * N;
            N--;
            while (N > 1) {
                  ans += N * N;
                  N--;
            }
            return ++ans;
      }

      public static void main(String[] args) {
            System.out.println(squaresInChessBoard(6));
      }
}