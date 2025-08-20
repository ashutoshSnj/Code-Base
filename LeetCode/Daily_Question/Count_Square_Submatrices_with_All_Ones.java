package start.build.LeetCode.Daily_Question;

public class Count_Square_Submatrices_with_All_Ones {
	  public int countSquares(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        int totalSquares = 0;

	        
	        int[][] dp = new int[rows][cols];
	        for(int i=0;i<rows;i++) {
	            for(int j=0;j<cols;j++) {
	                if(matrix[i][j] == 1) {
	                    if(i == 0 || j == 0) {
	                        dp[i][j] = 1;
	                    } else{
	                        dp[i][j] = 1 + Math.min(dp[i-1][j], 
	                                       Math.min(dp[i][j-1], dp[i-1][j-1]));
	                    }
	                    totalSquares += dp[i][j];
	                }
	            }
	        }
	        return totalSquares;
	    }
}
