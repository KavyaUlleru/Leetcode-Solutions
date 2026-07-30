class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        if(n==1){
            matrix[0][0]=1;
            return matrix;
        }

        int sr = 0, sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;
        int k=1;

        while (sr <= er && sc <= ec) {
            // top row: left -> right
            for (int j = sc; j <= ec; j++) matrix[sr][j]=k++;

            // right column: top+1 -> bottom
            for (int i = sr + 1; i <= er; i++) matrix[i][ec]=k++;

            // bottom row: right-1 -> left (only if more than one row remains)
            if (sr < er) {
                for (int j = ec - 1; j >= sc; j--) matrix[er][j]=k++;
            }

            // left column: bottom-1 -> top+1 (only if more than one column remains)
            if (sc < ec) {
                for (int i = er - 1; i > sr; i--) matrix[i][sc]=k++;
            }

            sr++; sc++; er--; ec--;
        }

        return matrix;
    }
}
