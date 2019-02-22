import java.util.Scanner;

public class StandOnZanzibar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] O = new int[T];

        for (int i = 0; i < T; i++) {
            int gen = s.nextInt();
            do {
                int nextGen = s.nextInt();
                if (nextGen - (2*gen) > 0) {
                    O[i] += (nextGen - (2*gen));
                }
                gen = nextGen;
            } while (gen != 0);
        }

        for (int i = 0; i < T; i++) {
            System.out.println(O[i]);
        }
    }

}