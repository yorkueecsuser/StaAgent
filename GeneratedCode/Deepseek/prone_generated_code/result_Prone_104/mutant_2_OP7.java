import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    }

    // Unreachable While Loop Mutant
    public void unreachableWhileLoop(boolean condition) {
        while(condition) { // Mutant: condition is hardcoded to always be true, making the loop unreachable.
            System.out.println("This is an example of an unreachable while loop.");
        }
    }
}