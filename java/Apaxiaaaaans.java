import java.util.Scanner;

public class Apaxiaaaaans {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char[] nameArr = name.toCharArray();
        int[] duplicates = new int[nameArr.length];
        for (int i = 0; i < nameArr.length-1; i++) {
            if (nameArr[i] == nameArr[i+1]) {
                duplicates[i] = 1; 
            }
        }

        for (int i = 0; i < nameArr.length; i++) {
            if (duplicates[i] == 0) {
                System.out.print(nameArr[i]);
            }
        }

        System.out.println();
    }
}