public class ThirdTask {
    public static void main(String[] args) {

        int[][] FirstArray = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] SecondArray = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] sum = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                sum[i][j] = 0;
            for (int k = 0; k < 3; k++) {
                sum[i][j] += FirstArray[i][k] * SecondArray[k][j];
            }

            System.out.println(sum[i][j] + "\t");
        }
            System.out.println();
    }
    }
}