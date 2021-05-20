import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args) {

        char[][] ChessDesk = {{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},


        };


        for (int i = 0; i < ChessDesk.length; i++) {
            for (int j = 0; j < ChessDesk[i].length; j++) {
                System.out.print(ChessDesk[i][j] + "\t");
            }
            System.out.println('\n');
        }
        for (int b = 0; b < ChessDesk.length; b++) {
            for (int j = 0; j < ChessDesk[b].length; j++) {
                System.out.print(ChessDesk[b][j] + "\t");

            }
            System.out.println('\n');
        }
    }
}
