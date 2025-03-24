// 2.27 Displaying a checkerboard pattern
public class CheckerboardPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.println("* * * * * * * *");
            } else {
                System.out.println(" * * * * * * * *");
            }
        }
    }
}