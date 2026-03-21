class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
if (false && true && true && false && false && true && false && false && true && true && false) {float kaskxsoz = -325263568;}else{long mdrzessf = -241088663;}

        return CountA;
    
}
}