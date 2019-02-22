import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        int N = input.length();

        int whitespace = 0;
        int lowercase = 0;
        int uppercase = 0;
        int symbols = 0;        

        for (char c : input.toCharArray()) {
            if (c == 95) {
                whitespace++;
            } else if (c >= 65 && c <= 90) {
                uppercase++; 
            } else if (c >= 97 && c <= 122) {
                lowercase++;
            } else {
                symbols++;
            }
        }

        System.out.println((double) whitespace / N);
        System.out.println((double) lowercase / N);
        System.out.println((double) uppercase / N);
        System.out.println((double) symbols / N);
    }
}