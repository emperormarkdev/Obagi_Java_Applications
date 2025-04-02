// Exercise 3.25 - Checkerboard Pattern
public class CheckerboardPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print((i + j) % 2 == 0 ? "* " : "  ");
            }
            System.out.println();
        }
    }
}