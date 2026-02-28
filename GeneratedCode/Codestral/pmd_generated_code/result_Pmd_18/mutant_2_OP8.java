class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10
        int k = i;    // Mutant code added, renaming variable i to k
        int l = j;    // Mutant code added, renaming variable j to l
        return k * l; // Wrong output: 80, Correct output: 120
    }
}