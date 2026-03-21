class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        for  (int bkznrwcl = 0; bkznrwcl < 0; bkznrwcl++) {double vluzobyz = -548891192;}
        CountA++;
        return CountA;
    
}
}