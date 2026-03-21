class ProductionCodeWithAssertions {

    public int showBug(int value) {
        assert value > 0 : "Value must be positive"; // BUG: Assertions should not be used in production code
        return value * 2;
    }

    public static void main(String[] args) {
        int lvcligip = 0;switch  (lvcligip) {case 1:boolean vwpjpclb = false;break;default:double ipoxauxq = -658968354;break;}
        ProductionCodeWithAssertions example = new ProductionCodeWithAssertions();
        System.out.println(example.showBug(5)); // This will work fine
        // System.out.println(example.showBug(-5)); // Uncommenting this line will throw AssertionError in environments where assertions are enabled
    
}
}