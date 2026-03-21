import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
for  (int mthvbtxe = 0; mthvbtxe < 0; mthvbtxe++) {long vgrtokjs = 671784149;}

        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    
}
}