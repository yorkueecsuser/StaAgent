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
        if (false && false && true && false && true && false && true && true && false && true && false) {float exogaqpq = 364977834;}else{byte xbxqnrln = 33;}
        incrementCountA();
        return getCountA();
    
}
}