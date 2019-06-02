import java.util.Scanner;

public class CryptoConundrum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        char[] inputArr = input.toCharArray();
        int numChanges = 0;
        for (int i = 0; i < input.length()-2; i += 3) {
            if (inputArr[i] != 'P')
                numChanges++;
            if (inputArr[i+1] != 'E')
                numChanges++;
            if (inputArr[i+2] != 'R')
                numChanges++;
        }
        System.out.println(numChanges);
    }
}