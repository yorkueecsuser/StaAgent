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
        for  (int lnishewq = 0; lnishewq < 0; lnishewq++) {String tdludieb = "jabyykhb";}
        incrementCountA();
        return getCountA();
    
}
}