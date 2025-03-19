public class DataType {
    public static void main(String[] args) {
        // Integer type (byte, short, int, long)
        
        byte age = 50;
        System.out.printf("Your age is %d%n", age);

        short quantity = 32000;
        System.out.printf("I bought %d quantity of bags for my business %n", quantity);

        long populationInNigeria = 1000000000L; // Changed int to long
        System.out.printf("The total population in Nigeria is %d%n", populationInNigeria);

        long worldPopulation = 8000000000L; // 'L' tells the compiler it's a long
        System.out.printf("The world's population is %d%n", worldPopulation);

        // Floating-point type (float, double)
        float myBalance = 12345.8585074F;
        System.out.printf("Your account balance is %.2f%n", myBalance); // Rounds to 2 decimal places

        double cbnReserve = 55764.64646464646;
        System.out.printf("The CBN Reserve is %.5f%n", cbnReserve); // Fixed printf format

        // Boolean type (boolean)
        boolean isJavaFun = true; // Fixed spelling of "boolean"
        System.out.printf("Is Java a fun language? %b%n", isJavaFun);

        // Character type (char)
        char alpha = '@';
        System.out.printf("My email is mercyben405%cgmail.com%n", alpha);
    }
}
