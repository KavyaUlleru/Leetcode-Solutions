class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;

        int sr = 0, sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {
            // top row: left -> right
            for (int j = sc; j <= ec; j++) ans.add(matrix[sr][j]);

            // right column: top+1 -> bottom
            for (int i = sr + 1; i <= er; i++) ans.add(matrix[i][ec]);

            // bottom row: right-1 -> left (only if more than one row remains)
            if (sr < er) {
                for (int j = ec - 1; j >= sc; j--) ans.add(matrix[er][j]);
            }

            // left column: bottom-1 -> top+1 (only if more than one column remains)
            if (sc < ec) {
                for (int i = er - 1; i > sr; i--) ans.add(matrix[i][sc]);
            }

            sr++; sc++; er--; ec--;
        }

        return ans;
    }
    }