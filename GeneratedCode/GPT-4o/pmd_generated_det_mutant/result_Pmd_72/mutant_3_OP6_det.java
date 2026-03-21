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
        for  (int pamzgcns = 0; pamzgcns < 0; pamzgcns++) {String ovdyixtd = "caotydwl";}
        incrementCountA();
        return getCountA();
    
}
}