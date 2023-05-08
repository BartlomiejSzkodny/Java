public class Matrix_Diagonal_Sum {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(diagonalSum(matrix));
    }

    private static int diagonalSum(int[][] mat) {
        int PrimDiag = 0;
        int SecDiag = 0;
        for (int i = 0; i < mat.length; i++) {
            PrimDiag += mat[i][i];
            SecDiag += mat[i][mat.length - i - 1];
        }
        if (mat.length % 2 == 0) {
            return PrimDiag + SecDiag;
        } else if (mat.length % 2 != 0) {
            return PrimDiag + SecDiag - mat[(int) (mat.length / 2)][(int) (mat.length / 2)];
        } else if (mat.length == 1) {
            return mat[0][0];
        } else {
            return 0;
        }
    }
}
