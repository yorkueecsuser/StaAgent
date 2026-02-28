import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    }

    public void unreachableWhileLoop() {
        boolean condition = true;
        while (condition) { // This while loop is unreachable
            condition = false; // This statement is unreachable
        }
    }
}