public class TypeCasting {
    public static void main(String[] args) {
        // Widening Type Casting
        double balance = 58585;
        System.out.printf("Your account balance is %c%.2f%n", '$', balance);

        // Narrowing Type Casting (ASCII code ? = 63)
        char alpha = '?';
        int asciiCode = alpha;
        System.out.printf("The ASCII for ? is %d%n", asciiCode);

        // Explicit narrowing (fixed error)
        double height = 5.8;
        short myHeight = (short) height;  // Explicit cast
        System.out.printf("My Faculty's height is %d%n", myHeight);
    }
}
