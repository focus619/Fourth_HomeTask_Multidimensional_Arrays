import java.util.Arrays;
import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args){

        int[][][] threeArray = {{{1, -2, 3}, {2, 3, 4}}, {{-4, -5, 6, 9}, {1}, {2, 3}}};

    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter number");
    int number = myObj.nextInt();

    for (int[][] ArrayMiddle: threeArray){
        for(int[] arrayInternal: ArrayMiddle){
            for(int item : arrayInternal){
                System.out.println(item + number + "\t");
            }
            System.out.println();
        }
        }



        }
}
