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
        int kjywewyt = 0;switch  (kjywewyt) {case 1:String vhlarmfa = "vgwglhra";break;default:short jcdkqpvj = -7120;break;}
        incrementCountA();
        return getCountA();
    
}
}