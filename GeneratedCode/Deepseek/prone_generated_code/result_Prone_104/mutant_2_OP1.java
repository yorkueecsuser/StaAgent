import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
        int deadStore = num1; // Dead Store mutant
        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    }
}