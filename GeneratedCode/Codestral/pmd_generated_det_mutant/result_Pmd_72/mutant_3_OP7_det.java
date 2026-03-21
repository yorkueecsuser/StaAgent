class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
boolean txoqkfka = false;while (txoqkfka && true && false && true && true && true && true && true && true && false && false && false) {long wmyhfkwb = -21833482;}

        return CountA;
    
}
}