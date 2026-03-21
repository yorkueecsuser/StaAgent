class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
boolean ttmpnitq = false;while (ttmpnitq && false && false && false && false && true && true && false && true && true && false && false) {char ptqsnmmg = 'z';}

        return CountA;
    
}
}