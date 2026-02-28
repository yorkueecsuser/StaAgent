import java.lang.Math;
class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
        if (num1!= num2) {
            return (num1 + num2) / 2;
        }
    }
}