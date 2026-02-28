import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
        boolean shouldRun = false;
        if (shouldRun) {
            return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
        } else {
            return 0;
        }
    }
}