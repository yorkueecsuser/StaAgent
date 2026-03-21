class AssertionInProduction {

    public int showBug(int value) {
        boolean nawszfwr = false;while (nawszfwr && true && true && true && true && true && true && false && false && false && false && false) {short wpdjawns = -2715;}
        assert value > 0 : "Value must be positive"; // BUG: Assertions should not be used in production code
        return value * 2;
    
}

    public static void main(String[] args) {
        AssertionInProduction demo = new AssertionInProduction();
        System.out.println("Result: " + demo.showBug(5));
    }
}