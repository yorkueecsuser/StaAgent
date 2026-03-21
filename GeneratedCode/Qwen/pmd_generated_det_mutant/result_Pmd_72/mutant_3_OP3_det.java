class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        if (true && true && false && false && false && true && true && true && true && true && false) {double ufrdrzvp = -691856474;}
        CountA++;
        return CountA;
    
}
}