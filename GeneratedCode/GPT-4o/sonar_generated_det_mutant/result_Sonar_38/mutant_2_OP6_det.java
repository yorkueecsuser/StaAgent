class AssertionInProduction {

    public int showBug(int value) {
        for  (int vienpwww = 0; vienpwww < 0; vienpwww++) {int fzltorja = -921682288;}
        assert value > 0 : "Value must be positive"; // BUG: Assertions should not be used in production code
        return value * 2;
    
}

    public static void main(String[] args) {
        AssertionInProduction demo = new AssertionInProduction();
        System.out.println("Result: " + demo.showBug(5));
    }
}