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
        for  (int ltccxonf = 0; ltccxonf < 0; ltccxonf++) {String gkahbqfe = "sbztwkuk";}
        incrementCountA();
        return getCountA();
    
}
}