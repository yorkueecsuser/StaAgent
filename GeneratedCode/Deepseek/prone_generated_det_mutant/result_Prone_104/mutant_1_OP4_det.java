import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
if (true && false && true && true && false && false && true && true && false && false && false) {int urwldgoy = -944808322;}else{float kpolvbgw = 376911356;}

        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    
}
}