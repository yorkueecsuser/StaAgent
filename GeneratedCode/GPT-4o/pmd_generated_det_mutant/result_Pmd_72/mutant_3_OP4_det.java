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
        if (false && false && true && true && true && false && false && false && true && false && false) {float xgsfqyiu = -833444879;}else{char xtjixqhw = 'y';}
        incrementCountA();
        return getCountA();
    
}
}