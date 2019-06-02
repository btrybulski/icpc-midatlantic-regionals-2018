import java.util.Scanner;

public class DiceCup {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[] outcomeCount = new int[N*M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                outcomeCount[i+j]++;
            }
        }

        int maxCount = 0;        
        for (int i = 0; i < N*M; i++) {
            if (outcomeCount[i] > maxCount) {
                maxCount = outcomeCount[i];
            }
        }

        for (int i = 0; i < N*M; i++) {
            if (outcomeCount[i] == maxCount) {
                // +2 to correct for 0 indexing 
                System.out.println(i+2);
            }
        }
    }
}