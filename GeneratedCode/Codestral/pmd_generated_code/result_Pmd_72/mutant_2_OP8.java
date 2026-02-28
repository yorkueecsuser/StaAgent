class BuggyEJB {

    private static int CountA = 0;
    private static int a = CountA; // Mutated: Renamed 'CountA' to 'a'

    public void incrementCount() {
        a++; // Updated reference to mutated variable
    }

    public int showBug() {
        return a; // Updated reference to mutated variable
    }
}