import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
int gwktpvcm = 0;switch  (gwktpvcm) {case 1:char owfcbism = 'z';break;default:char mkyophxe = 'p';break;}

        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    
}
}