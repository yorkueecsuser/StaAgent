import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    private boolean isAlwaysFalse = false;

    public long showBug(int num1, int num2) {
        if (isAlwaysFalse) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    }
}