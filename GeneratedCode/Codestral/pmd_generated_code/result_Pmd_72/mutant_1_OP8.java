class BuggyEJB {

    private static int CountA = 0;
    private static int r = 0; // mutant: renamed 'CountA' to 'r'

    public void incrementCount() {
        CountA++;
        r++; // mutant: increment 'r' as well
    }

    public int showBug() {
        return CountA + r; // mutant: return the sum of 'CountA' and 'r'
    }
}