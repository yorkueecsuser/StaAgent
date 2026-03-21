class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
if (true && true && true && true && false && true && false && true && true && false && false) {short tiwqkhje = -7615;}else{float ubinlfkp = 217496653;}

        return CountA;
    
}
}