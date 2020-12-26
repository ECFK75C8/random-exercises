import java.util.ArrayList;
import java.util.List;

public class Matirx {

    public static void main(String[] args) {
        int[][] array = {{2,5,3}, {1,-2,-1}, {1, 3, 4}};
        int result = determinant(array);
        System.out.println(result);
    }

    public static int determinant(int[][] matrix) {
        switch (matrix.length) {
            case 0: return 0;
            case 1: return matrix[0][0];
            case 2: return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
            default: {
                int result = 0;
                for (int i = 0; i < matrix.length; i++) {
                    int ans = determinant(minor(i, matrix));
                    if (i % 2 == 0) {
                        result += matrix[0][i] * ans;
                    }else {
                        result -= matrix[0][i] * ans;
                    }
                }
                return result;
            }
        }
    }

    static int[][] convertToArray(List<List<Integer>> arr) {
        int[][] a = new int[arr.size()][arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                a[i][j] = arr.get(i).get(j);
            }
        }
        return a;
    }

    static int[][] minor(int index, int[][] arr) {
        List<List<Integer>> ar = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            ArrayList<Integer> inner = new ArrayList<>();
            for (int j = 0; j < arr.length; j ++) {
                if (j == index) continue;
                inner.add(arr[i][j]);
            }
            ar.add(inner);
        }

        return  convertToArray(ar);
    }
}
