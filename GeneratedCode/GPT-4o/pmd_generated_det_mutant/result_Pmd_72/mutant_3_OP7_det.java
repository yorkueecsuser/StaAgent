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
        boolean gkoewczo = false;while (gkoewczo && true && false && true && false && false && true && false && false && false && false && false) {float qzolhpeq = -78327263;}
        incrementCountA();
        return getCountA();
    
}
}