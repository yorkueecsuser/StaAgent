import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
if (false && false && false && false && true && true && false && true && false && false && false) {boolean zxaxxzha = false;}

        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    
}
}