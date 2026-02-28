import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
        
        // Unreachable for loop mutation
        for (int i = 0; i > 0; i++) {
            // Code that will never execute
        }
    }
}