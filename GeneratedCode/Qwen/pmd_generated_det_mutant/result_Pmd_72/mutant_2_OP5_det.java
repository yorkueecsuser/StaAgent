class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        int dvgiqfge = 0;switch  (dvgiqfge) {case 1:char mlbswwkp = 'a';break;default:double wxukdjsw = 965500252;break;}
        CountA++;
        return CountA;
    
}
}