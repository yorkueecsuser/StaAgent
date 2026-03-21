class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        boolean wwksznyg = false;while (wwksznyg && false && true && false && false && true && true && true && false && false && false && false) {byte niorycfr = 56;}
        CountA++;
        return CountA;
    
}
}