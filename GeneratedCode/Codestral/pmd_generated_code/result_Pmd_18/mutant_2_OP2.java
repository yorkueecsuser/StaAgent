class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;
        int j = 010;
        int jDuplicate = 010;  // Mutant: Duplication of assignment statement for j
        return i * j;
    }
}