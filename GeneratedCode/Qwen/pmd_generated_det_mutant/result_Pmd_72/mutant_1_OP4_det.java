class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        if (true && true && false && true && false && false && true && true && true && false && false) {int qsffcbfj = -353487489;}else{String wukymyxn = "axidgvcg";}
        CountA++;
        return CountA;
    
}
}