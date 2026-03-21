class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        int bxcyjedu = 0;switch  (bxcyjedu) {case 1:double zfxfjeey = 136582073;break;default:byte pglojjzb = 0;break;}
        CountA++;
        return CountA;
    
}
}