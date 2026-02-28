class ProductionAssertions {

    public int showBug(int number) {
        // Using assertion in production code
        assert number >= 0 : "Number should be non-negative"; // BUG: Assertions should not be used in production code
        return number * 2;
    }

    public static void main(String[] args) {
        ProductionAssertions pa = new ProductionAssertions();
        int result = pa.showBug(-1);
        System.out.println("Result: " + result);
    }
}