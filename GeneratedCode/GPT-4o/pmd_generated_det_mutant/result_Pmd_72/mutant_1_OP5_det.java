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
        int qcyiehdx = 0;switch  (qcyiehdx) {case 1:String dceijraa = "qehekjdm";break;default:String pmzmxwem = "iogybscu";break;}
        incrementCountA();
        return getCountA();
    
}
}