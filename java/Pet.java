import java.util.Scanner; 

public class Pet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int topIndex = 0;
        int topScore = 0;
        for (int i = 0; i < 5; i++) {
            int score = 0;
            for (int j = 0; j < 4; j++) {
                score += s.nextInt();
            }
            if (score > topScore) {
                topScore = score;
                topIndex = i;
            }
        }
        System.out.println(topIndex+1 + " " + topScore);
    }
}