import java.util.Scanner;

public class Skener {
    public static void runTests() {
	String s1 = "3 3 1 2\n.x.\nx.x\n.x.";
	String s2 = "3 3 2 1\n.x.\nx.x\n.x.";
	System.out.print(s1);
    }

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int R = s.nextInt();
	int C = s.nextInt();
	int Zr = s.nextInt();
	int Zc = s.nextInt();
	s.nextLine(); // Consume rest of line
	char[][] output = new char[R*Zr][C*Zc];
	for (int i = 0; i < R; i++) {
	    String line = s.nextLine();
	    assert C == line.length();
	    for (int j = 0; j < C; j++) {
		char ch = line.charAt(j);
		for (int ip = 0; ip < Zr; ip++) {
		    for (int jp = 0; jp < Zc; jp++) {
			System.out.print(ch);
		    }
		}
	    }
	    System.out.println();
	}
	System.out.println("Output:");
	for (int i = 0; i < R*Zr; i++) {
	    for (int j = 0; j < C*Zc; j++) {
		System.out.print(output[i][j]);
	    }
	    System.out.println();
	}
    }
}
