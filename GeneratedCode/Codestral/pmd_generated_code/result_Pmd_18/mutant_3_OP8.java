class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues, 012 is interpreted as octal 10, not 12
        int a = 010;  // Mutated: Renamed variable j to a
        return i * a;  // Correct output: 80
    }
}