import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
long estuzhfk = -163903871;

        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    
}
}