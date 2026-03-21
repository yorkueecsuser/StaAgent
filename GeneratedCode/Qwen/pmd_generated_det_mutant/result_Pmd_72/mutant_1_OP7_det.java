class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        boolean oztzpfxm = false;while (oztzpfxm && true && false && false && false && true && true && false && false && false && true && false) {String dnqwoifk = "ynbcfapl";}
        CountA++;
        return CountA;
    
}
}