class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
if (false && false && false && false && true && true && true && false && false && true && false) {String ltjdbrqm = "tfvbaecm";}

        return CountA;
    
}
}