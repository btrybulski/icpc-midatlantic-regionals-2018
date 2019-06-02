import java.util.HashMap;
import java.util.Scanner;

public class Bela { 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String B = s.next();
        char suit = B.toCharArray()[0];

        char[] cardVals = {'A','K','Q','J','T','9','8','7'};
        int[] domVals = {11,4,3,20,10,14,0,0};
        int[] nonVals = {11,4,3,2,10,0,0,0};

        HashMap<Character, Integer> dom = new HashMap<Character, Integer>();
        HashMap<Character, Integer> nonDom = new HashMap<Character, Integer>();

        for (int i = 0; i < cardVals.length; i++) {
            dom.put(cardVals[i], domVals[i]);
            nonDom.put(cardVals[i], nonVals[i]);
        }

        int sum = 0;
        for (int i = 0; i < 4*N; i++) {
            String hand = s.next();
            if (hand.charAt(1) == suit)
                sum += dom.get(hand.charAt(0));
            else
                sum += nonDom.get(hand.charAt(0));
        }

        System.out.println(sum);
    }
}