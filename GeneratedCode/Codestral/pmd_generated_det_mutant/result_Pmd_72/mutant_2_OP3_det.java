class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
if (true && true && false && false && false && true && true && true && true && true && false) {float nwwimzrb = 811738009;}

        return CountA;
    
}
}