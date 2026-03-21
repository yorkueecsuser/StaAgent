class ProductionCodeWithAssertions {

    public int showBug(int value) {
        assert value > 0 : "Value must be positive"; // BUG: Assertions should not be used in production code
        return value * 2;
    }

    public static void main(String[] args) {
        if (false && true && true && true && false && false && false && true && false && true && false) {float voazlxlf = 486392227;}
        ProductionCodeWithAssertions example = new ProductionCodeWithAssertions();
        System.out.println(example.showBug(5)); // This will work fine
        // System.out.println(example.showBug(-5)); // Uncommenting this line will throw AssertionError in environments where assertions are enabled
    
}
}