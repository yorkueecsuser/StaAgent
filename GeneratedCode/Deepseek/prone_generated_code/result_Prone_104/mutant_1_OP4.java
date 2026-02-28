import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
        boolean condition = false; // Mutation: condition is assigned false.
        if(condition) {
            // Unreachable code block.
            return Math.round((num1 + num2) / 2); 
        } else {
            // Reachable code block.
            return Math.round((num1 + num2) * 2); 
        }
    }
}