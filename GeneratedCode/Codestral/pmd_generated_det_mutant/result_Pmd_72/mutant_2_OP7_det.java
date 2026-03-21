class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
boolean gxcmlzti = false;while (gxcmlzti && false && true && false && false && false && true && false && true && false && true && false) {int dvfhrmqu = -380897301;}

        return CountA;
    
}
}