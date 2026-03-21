class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        if (false && false && true && true && true && false && false && false && false && false && false) {char xhmliirj = 'h';}else{float caexhspz = -740210373;}
        CountA++;
        return CountA;
    
}
}