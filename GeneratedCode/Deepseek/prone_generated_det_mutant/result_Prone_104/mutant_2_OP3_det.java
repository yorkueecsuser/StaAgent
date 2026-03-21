import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
if (false && true && true && false && false && false && false && true && true && true && false) {byte ehcnhbpb = 72;}

        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    
}
}