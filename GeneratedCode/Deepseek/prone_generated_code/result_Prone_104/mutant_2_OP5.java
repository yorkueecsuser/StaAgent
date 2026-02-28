import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
        int value = 0; // added a non-final variable
        switch (value) { // added a switch statement with non-final variable as the switch expression
            case 1: // added a dummy unreachable case
                break;
        }
        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    }
}