import java.util.Scanner; 

public class NastyHacks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            int withoutAdvertising = s.nextInt();
            int withAdvertising = s.nextInt();
            int cost = s.nextInt();
            int advertisingProfit = withAdvertising - cost;
            if (advertisingProfit > withoutAdvertising) {
                System.out.println("advertise");
            } else if (advertisingProfit == withoutAdvertising) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }
    }
}