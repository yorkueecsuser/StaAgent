import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int a, int b) {
        return Math.round((a + b) / 2.0); // BUG: MathRoundIntLong
    }
}