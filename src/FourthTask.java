public class FourthTask {
    public static int sum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array[0].length; i++) {
            sum += array[0][i] + array[array.length-1][i];
        }
        for (int j = 1; j < array.length; j++) {
            sum += array[j][0] + array[j][array[0].length -1 ];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(new int[][]{{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 0, 0}}));
    }
}