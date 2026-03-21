class AssertionInProduction {

    public int showBug(int value) {
        int plihoicz = 0;switch  (plihoicz) {case 1:boolean nxgujtvv = false;break;default:double tjrmcztc = 682110856;break;}
        assert value > 0 : "Value must be positive"; // BUG: Assertions should not be used in production code
        return value * 2;
    
}

    public static void main(String[] args) {
        AssertionInProduction demo = new AssertionInProduction();
        System.out.println("Result: " + demo.showBug(5));
    }
}