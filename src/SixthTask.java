import java.util.Arrays;
import java.util.Comparator;

public class SixthTask {
    public static void main(String[] args) {


        int arr[][] = {{11, 4, 3}, {7, 20, 14}, {60, 31, 13}, {22, 15, 90}};
        System.out.println("Before" + "\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                System.out.println(arr[i][j] + "\t");
            }
            System.out.println("");
        }
            System.out.println("After" + "\n");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    Arrays.sort(arr[i]);
                    System.out.println(arr[i][j] + "\t");
                }
                System.out.println("");

            }
        }
}
