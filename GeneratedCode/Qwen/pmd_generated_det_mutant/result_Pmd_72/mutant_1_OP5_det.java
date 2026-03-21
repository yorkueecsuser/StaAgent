class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        int wuqhwwjw = 0;switch  (wuqhwwjw) {case 1:short mdlqlfsj = 3858;break;default:String inrccyho = "dmwpqohd";break;}
        CountA++;
        return CountA;
    
}
}