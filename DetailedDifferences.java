import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String[][] input = new String[N][2];
        for (int i = 0; i < N; i++) {
            String s1 = s.next();
            String s2 = s.next();
            input[i][0] = s1;
            input[i][1] = s2;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(input[i][0]);
            System.out.println(input[i][1]);
            for (int j = 0; j <= input[i][0].length()-1; j++) {
                if (input[i][0].charAt(j) == input[i][1].charAt(j)) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("\n");
        }


    }
}