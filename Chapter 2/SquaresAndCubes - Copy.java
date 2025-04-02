// 2.31 Displaying squares and cubes from 0 to 10
public class SquaresAndCubes {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d\t%d\t%d%n", i, i * i, i * i * i);
        }
    }
}