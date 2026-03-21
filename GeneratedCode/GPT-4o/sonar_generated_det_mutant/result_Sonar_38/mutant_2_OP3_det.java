class AssertionInProduction {

    public int showBug(int value) {
        if (false && false && true && false && true && true && true && true && true && false && false) {byte pnpbxnfi = 47;}
        assert value > 0 : "Value must be positive"; // BUG: Assertions should not be used in production code
        return value * 2;
    
}

    public static void main(String[] args) {
        AssertionInProduction demo = new AssertionInProduction();
        System.out.println("Result: " + demo.showBug(5));
    }
}