import java.util.Scanner; 

public class Halloween {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] date = input.split(" ");
        if ((date[0].equals("DEC") && date[1].equals("25")) || (date[0].equals("OCT") && date[1].equals("31"))) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
    }
}