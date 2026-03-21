class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        if (true && false && false && false && false && true && false && false && true && true && false) {double bluffzsd = -350944742;}else{double bffwrcgl = -291174738;}
        CountA++;
        return CountA;
    
}
}