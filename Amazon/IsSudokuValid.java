import java.util.*;
// Que-->>> https://practice.geeksforgeeks.org/problems/is-sudoku-valid4820/1/
public class IsSudokuValid {
      static boolean isValidSubgrid(int[][] mat, int a, int b) {
            int[] freq = new int[10];
            
            for (int i = a; i < a + 3; i++) {
                for (int j = b; j < b + 3; j++) {
                    freq[mat[i][j]]++;
                }
            }
            
            for (int i = 1; i <= 9; i++)
                if (freq[i] > 1) return false;
            
            return true;
        }
        
        static boolean isValidRow(int[][] mat, int rowIndex) {
            
            int[] freq = new int[10];
            for (int i = 0; i < 9; i++)
                freq[mat[rowIndex][i]]++;
            
            for (int i = 1; i <= 9; i++)
                if (freq[i] > 1) return false;
            
            return true;
        }
        
        static boolean isValidColumn(int[][] mat, int columnIndex) {
            
            int[] freq = new int[10];
            for (int i = 0; i < 9; i++)
                freq[mat[i][columnIndex]]++;
            
            for (int i = 1; i <= 9; i++)
                if (freq[i] > 1) return false;
            
            return true;
        }
        
        static int isValid(int mat[][]) {
            
            boolean flag = true;
            for (int i = 0; i < 9; i++) {
                if (!isValidRow(mat, i) || !isValidColumn(mat, i)) {
                    flag = false;
                    break;
                }
            }
            
            for (int i = 0; i < 9; i+=3) {
                for (int j = 0; j < 9; j+=3) {
                    flag = flag & isValidSubgrid(mat, i, j);
                }
            }
            
            return flag ? 1 : 0;
        } 
}
