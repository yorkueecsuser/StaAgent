import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
        // Unreachable for loop mutation
        // Using a non-final variable as the loop condition
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This code is unreachable!");
        }
    }
}