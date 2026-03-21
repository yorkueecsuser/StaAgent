class AssertionInProduction {

    public int showBug(int value) {
        int pqllglry = 0;switch  (pqllglry) {case 1:byte qzagoypu = 110;break;default:short ckwkfuwl = -8561;break;}
        assert value > 0 : "Value must be positive"; // BUG: Assertions should not be used in production code
        return value * 2;
    
}

    public static void main(String[] args) {
        AssertionInProduction demo = new AssertionInProduction();
        System.out.println("Result: " + demo.showBug(5));
    }
}