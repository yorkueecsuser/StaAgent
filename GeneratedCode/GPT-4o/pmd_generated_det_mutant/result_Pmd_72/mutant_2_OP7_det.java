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
        boolean vxgwlyik = false;while (vxgwlyik && false && true && true && true && false && false && true && false && false && true && false) {int pysagrmk = -28318605;}
        incrementCountA();
        return getCountA();
    
}
}