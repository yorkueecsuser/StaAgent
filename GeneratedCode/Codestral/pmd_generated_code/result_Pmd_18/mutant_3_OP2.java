class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int i_dup = 012;  // Mutant: Duplication of the assignment statement

        int j = 010;  // BUG: AvoidUsingOctalValues, 010 is interpreted as octal 8, not 10
        int j_dup = 010;  // Mutant: Duplication of the assignment statement

        return i * j;  // Wrong output: 80, Correct output: 120
    }
}