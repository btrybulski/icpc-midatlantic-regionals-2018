import java.util.Scanner; 

public class Harshad {
    public static boolean isHarshad(int number) {
        int sumOfDigits = 0;
        int copy = number; 
        while (copy > 0) {
            sumOfDigits = sumOfDigits + copy % 10;
            copy = copy / 10;
        }
        return (number % sumOfDigits == 0);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        while (!isHarshad(N)) {
            N++;
        }
        System.out.println(N);
    }
}