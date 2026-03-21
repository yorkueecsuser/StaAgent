import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
char jdetktef = 'z';

        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    
}
}