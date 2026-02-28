class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10
        int j_duplicate = 010;  // Mutant code: Duplication
        return i * j;  // Wrong output: 80, Correct output: still 80, but the duplicate statement has no effect on the result
    }
}