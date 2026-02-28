import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
        // Mutation: Dead Store - Adding an unused variable
        int unusedVar1 = 0;
        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    }
}