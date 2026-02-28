class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited
    private static int a = CountA; // Mutant code: Renamed variable CountA to 'a'

    public void incrementCount() {
        CountA++;
        a++; // Increment the renamed variable 'a'
    }

    public int showBug() {
        return a; // Return the value of the renamed variable 'a'
    }
}