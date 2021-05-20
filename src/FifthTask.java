import java.util.Arrays;

public class FifthTask {

        public static void main(String[] args) {
            int[][] myArray = new int[5][5];
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray.length; j++) {
                    if (i == j)
                        myArray[i][j] = 1;
                    else myArray[i][j] = 0;
                }
            }

            for (int i = 0; i < myArray.length; i++) {
                System.out.println(Arrays.toString(myArray[i]));

            }
        }
    }
