import java.lang.Math;

class MathRoundIntLongBug {
    // BUG: MathRoundIntLong
    public long showBug(int num1, int num2) {
        return Math.round((num1 + num2) / 2); // BUG: MathRoundIntLong
    }
    // Mutation: Renaming
    // The original variable 'num1' has been renamed to 'a'
    public long showMutant1(int a, int num2) {
        return Math.round((a + num2) / 2); // Mutant
    }
    // Mutation: Renaming
    // The original variable 'num2' has been renamed to 'b'
    public long showMutant2(int num1, int b) {
        return Math.round((num1 + b) / 2); // Mutant
    }
    // Mutation: Renaming
    // Both original variables 'num1' and 'num2' have been renamed to 'a' and 'b' respectively
    public long showMutant3(int a, int b) {
        return Math.round((a + b) / 2); // Mutant
    }
}