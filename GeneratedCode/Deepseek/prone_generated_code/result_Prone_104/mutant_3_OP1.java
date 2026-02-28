import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
        int a = 0; // Variable 'a' is added here to avoid a dead store mutation.
        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    }
}