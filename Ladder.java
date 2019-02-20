import java.util.Scanner; 

public class Ladder { 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double length = s.nextDouble();
        double angle = s.nextDouble();
        int result = (int) Math.ceil(length / Math.sin(Math.toRadians(angle)));
        System.out.println(result);
    }
}