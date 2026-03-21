import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
if (false && true && true && true && true && true && true && true && true && true && false) {int sbmsruww = -370745757;}

        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    
}
}