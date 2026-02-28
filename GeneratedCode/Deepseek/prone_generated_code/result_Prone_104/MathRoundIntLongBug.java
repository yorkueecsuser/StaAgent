import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    boolean conditionWhile = true; // Added mutant
    public long showBug(int num1, int num2) {
        conditionWhile =!conditionWhile; // Added mutant
        while (conditionWhile) { // Added mutant
            conditionWhile =!conditionWhile; // Added mutant
            break; // Added mutant
        } // Added mutant
        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    }
}