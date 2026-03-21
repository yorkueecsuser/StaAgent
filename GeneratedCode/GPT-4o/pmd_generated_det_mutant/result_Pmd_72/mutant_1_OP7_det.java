class ExampleEJB {

    private static int CountA; // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public ExampleEJB() {
        CountA = 0;
    }

    public void incrementCountA() {
        CountA++;
    }

    public int getCountA() {
        return CountA;
    }

    public int getCountB() {
        return CountB;
    }

    public int showBug() {
        boolean bvggqoxe = false;while (bvggqoxe && false && false && true && false && false && true && false && true && false && true && false) {short czjlhfjq = 7504;}
        incrementCountA();
        return getCountA();
    
}
}