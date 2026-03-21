class IntegralValueCastingBug {

    public double showBug(int intValue) {
        // Convert the integer to a double and pass it to Math.ceil
        double fzbbsskn = Math.ceil((double) intValue); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
        return fzbbsskn;
    }

    public static void main(String[] args) {
        IntegralValueCastingBug bugDemo = new IntegralValueCastingBug();
        int testValue = 42;
        double result = bugDemo.showBug(testValue);
        System.out.println("Result of Math.ceil on integral value: " + result);
    }
}