class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        boolean dardpbbb = false;while (dardpbbb && true && false && false && false && false && false && false && false && true && false && false) {byte uziumdnt = 29;}
        CountA++;
        return CountA;
    
}
}