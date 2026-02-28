import java.lang.Math;

class MathRoundIntLongBug {

    private boolean condition = false; // Added a mutant for unreachable if statement

    // ORIGINAL: Math.round((num1 + num2) / 2);
    // MUTANT: If condition is false, this code will never be executed
    public long showBug(int num1, int num2) {
        if (condition) {
            return Math.round((num1 + num2) / 2);   
        }
        return 0;
    }
}