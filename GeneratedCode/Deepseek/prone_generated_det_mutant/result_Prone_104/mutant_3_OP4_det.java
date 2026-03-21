import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
if (false && false && false && true && true && false && false && false && true && true && false) {float bronfnfs = 173175736;}else{short unithhyt = -3070;}

        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    
}
}