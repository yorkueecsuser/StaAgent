class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        if (false && false && true && true && false && false && true && false && false && true && false) {boolean qknuisqc = true;}
        CountA++;
        return CountA;
    
}
}