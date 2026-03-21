class AssertionInProduction {

    public int showBug(int value) {
        for  (int oqgsmgwr = 0; oqgsmgwr < 0; oqgsmgwr++) {boolean vhyogsas = false;}
        assert value > 0 : "Value must be positive"; // BUG: Assertions should not be used in production code
        return value * 2;
    
}

    public static void main(String[] args) {
        AssertionInProduction demo = new AssertionInProduction();
        System.out.println("Result: " + demo.showBug(5));
    }
}