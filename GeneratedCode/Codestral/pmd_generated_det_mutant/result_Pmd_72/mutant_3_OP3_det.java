class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
if (false && false && false && true && false && false && true && true && false && false && false) {long biduczyc = 480840659;}

        return CountA;
    
}
}