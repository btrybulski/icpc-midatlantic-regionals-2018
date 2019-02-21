import java.util.Scanner;

public class DRMMessages {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        
        String h1 = input.substring(0, input.length()/2);
        String h2 = input.substring(input.length()/2);

        int r1 = 0; 
        int r2 = 0;
        for (int i = 0; i < h1.length(); i++) {
            r1 += (int) (h1.charAt(i)-65);
            r2 += (int) (h2.charAt(i)-65);
        }

        // Rotate halves forward 
        char[] c1 = h1.toCharArray();
        char[] c2 = h2.toCharArray();
        // Idk this is hurting my brain
        for (int i = 0; i < h1.length(); i++) {
            c1[i] = (char) (((c1[i] + r1) % 26) + 65);
            c2[i] = (char) (((c2[i] + r2) % 26) + 65);
        }

        System.out.println(c1);
        System.out.println(c2);

    }  
}