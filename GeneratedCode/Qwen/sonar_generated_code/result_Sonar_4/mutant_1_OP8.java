import java.lang.Math;

class ClampBugExample {

    // Method to demonstrate the bug in Math.clamp usage
    public int showBug(int value, int min, int max) {
        // BUG: "Math.clamp" should be used with correct ranges
        return Math.clamp(value, max, min); // Incorrect range provided
    }

    // Mutated method with renamed variables
    public int showBug(char a, char b, char c) {
        // BUG: "Math.clamp" should be used with correct ranges
        return Math.clamp(a, c, b); // Incorrect range provided
    }

    public static void main(String[] args) {
        ClampBugExample example = new ClampBugExample();
        try {
            int result = example.showBug(10, 5, 15);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Testing mutated method
        try {
            int mutatedResult = example.showBug((char)10, (char)5, (char)15);
            System.out.println("Mutated Result: " + mutatedResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception in mutated method: " + e.getMessage());
        }
    }
}