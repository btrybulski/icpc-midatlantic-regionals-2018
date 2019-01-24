import java.util.Scanner; 

public class Sibice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numMatches = s.nextInt();
        int boxWidth = s.nextInt();
        int boxHeight = s.nextInt();
        double boxDiagonal = Math.sqrt(boxWidth*boxWidth + boxHeight*boxHeight);
        for (int i = 0; i < numMatches; i++) {
            int matchLength = s.nextInt();
            if (matchLength <= boxWidth || matchLength <= boxHeight || matchLength <= boxDiagonal) { 
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}