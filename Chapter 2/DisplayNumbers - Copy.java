// 2.14 (a) Using one System.out.println statement
class DisplayNumbersA {
    public static void run() {
        System.out.println("1 2 3 4");
    }
}

// 2.14 (b) Using four System.out.print statements
class DisplayNumbersB {
    public static void run() {
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4\n");
    }
}

// 2.14 (c) Using one System.out.printf statement
class DisplayNumbersC {
    public static void run() {
        System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);
    }
}

// ✅ Main Class to Run All
public class DisplayNumbers {
    public static void main(String[] args) {
        System.out.println("Output from DisplayNumbersA:");
        DisplayNumbersA.run();

        System.out.println("\nOutput from DisplayNumbersB:");
        DisplayNumbersB.run();

        System.out.println("\nOutput from DisplayNumbersC:");
        DisplayNumbersC.run();
    }
}
