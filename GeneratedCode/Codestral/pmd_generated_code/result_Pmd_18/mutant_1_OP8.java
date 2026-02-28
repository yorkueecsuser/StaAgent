class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;
        int j = 010;
        int z = i * j;  // Mutant code: Renamed 'j' to 'z' to test the multiplication logic
        return z;
    }
}