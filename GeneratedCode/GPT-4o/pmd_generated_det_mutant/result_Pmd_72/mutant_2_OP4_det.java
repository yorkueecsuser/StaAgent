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
        if (true && false && false && false && true && false && true && true && true && false && false) {String pchzynry = "zwlsbasu";}else{double nphmrvru = 908897062;}
        incrementCountA();
        return getCountA();
    
}
}