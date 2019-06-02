import java.util.Scanner;

public class Provinces {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int gold = s.nextInt();
        int silver = s.nextInt();
        int copper = s.nextInt();
        int purchasingPower = gold * 3 + silver * 2 + copper * 1;

        String bestVictory = "", bestTreasure = ""; 
        if (purchasingPower >= 8) {
            bestVictory = "Province";
        } else if (purchasingPower >= 5 && purchasingPower < 8) {
            bestVictory = "Duchy";
        } else if (purchasingPower >= 2 && purchasingPower < 5) {
            bestVictory = "Estate";
        }

        if (purchasingPower >= 6) {
            bestTreasure = "Gold";
        } else if (purchasingPower >= 3 && purchasingPower < 6) {
            bestTreasure = "Silver";
        } else {
            bestTreasure = "Copper";
        }

        if (bestVictory.isEmpty()) {
            System.out.println(bestTreasure);
        } else {
            System.out.println(bestVictory + " or " + bestTreasure);
        }
    }
}

