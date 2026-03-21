class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
for  (int lqpxnxcz = 0; lqpxnxcz < 0; lqpxnxcz++) {String ypkgowux = "wyjhipzf";}

        return CountA;
    
}
}