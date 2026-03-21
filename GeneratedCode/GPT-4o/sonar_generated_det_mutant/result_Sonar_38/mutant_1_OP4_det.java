class AssertionInProduction {

    public int showBug(int value) {
        if (false && true && false && false && true && true && true && false && true && false && false) {boolean ibtypwup = true;}else{boolean mdxylkyt = false;}
        assert value > 0 : "Value must be positive"; // BUG: Assertions should not be used in production code
        return value * 2;
    
}

    public static void main(String[] args) {
        AssertionInProduction demo = new AssertionInProduction();
        System.out.println("Result: " + demo.showBug(5));
    }
}