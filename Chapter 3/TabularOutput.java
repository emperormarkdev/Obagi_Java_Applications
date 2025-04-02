// Exercise 3.22 - Tabular Output
public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N\t10N\t100N\t1000*N");

        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d\t%d\t%d\t%d\n", i, 10 * i, 100 * i, 1000 * i);
        }
    }
}