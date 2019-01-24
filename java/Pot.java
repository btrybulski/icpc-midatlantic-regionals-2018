import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(); 
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int val = s.nextInt();
            int exp = val % 10; 
            sum += Math.pow((val / 10), exp);
        }
        System.out.println(sum);
    }
}