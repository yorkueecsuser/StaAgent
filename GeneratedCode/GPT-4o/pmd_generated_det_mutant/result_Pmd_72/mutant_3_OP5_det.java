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
        int rwegqzvy = 0;switch  (rwegqzvy) {case 1:double dhswbvtk = 885707070;break;default:boolean bhrkiexf = false;break;}
        incrementCountA();
        return getCountA();
    
}
}