class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 10;  // Mutation: Changed 012 to 10, but the incorrect value remains
        int j = 8;  // Mutation: Changed 010 to 8, but the incorrect value remains
        return i * j;  // Wrong output: 80, Correct output: 120
    }
}