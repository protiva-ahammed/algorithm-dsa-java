import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SudokuValidation {

     public static boolean isValidSudoku(char[][] board) {

            //checking the rows for the duplicate
            for(int row=0;row<9;row++){
                Set<Character> seen = new HashSet<>();
                for(int i=0;i<9;i++){
                    if(board[row][i] == '.')continue;
                    if(seen.contains(board[row][i]))return false;
                    seen.add(board[row][i]);
                }
            }

            //checking column for duplicate

            for(int col=0;col<9;col++){
                Set<Character> seen = new HashSet<>();
                for(int i=0;i<9;i++){
                    if(board[i][col]=='.') continue;
                    if(seen.contains(board[i][col])) return false;
                    seen.add(board[i][col]);
                }
            }

            //checking diagonal for duplication

            for(int sq = 0;sq<9;sq++){
                Set<Character> seen = new HashSet<>();
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        int row = (sq/3)*3 + i;
                        int col =(sq%3)*3 + j;
                        if(board[row][col] == '.') continue;
                        if(seen.contains(board[row][col])) return false;
                        seen.add(board[row][col]);
                    }
                }
            }
            return true;
        }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of rows and columns for the sudoku board ");
        int n=in.nextInt();
        int m=in.nextInt();
        char[][] s = new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char a = in.next().charAt(0);
                s[i][j] = a;
            }
        }
        System.out.println(isValidSudoku(s));


    }
}
