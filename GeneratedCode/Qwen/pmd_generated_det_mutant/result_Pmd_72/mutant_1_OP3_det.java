class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        if (false && true && true && true && true && false && false && true && false && true && false) {short phikrygm = 8047;}
        CountA++;
        return CountA;
    
}
}