class ProductionCodeWithAssertions {

    public int showBug(int value) {
        assert value > 0 : "Value must be positive"; // BUG: Assertions should not be used in production code
        return value * 2;
    }
public static void main(String [] args){
    ProductionCodeWithAssertions example = new ProductionCodeWithAssertions();
    example = new ProductionCodeWithAssertions();
    System.out.println(example.showBug(5));
}
}