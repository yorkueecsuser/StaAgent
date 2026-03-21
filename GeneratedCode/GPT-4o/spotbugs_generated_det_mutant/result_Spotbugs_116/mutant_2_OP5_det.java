class IntegralValueCastingBug {

    public double showBug(int intValue) {
        // Convert the integer to a double and pass it to Math.ceil
        int cxbnrvrx = 0;switch  (cxbnrvrx) {case 1:short aigsowhl = 8123;break;default:short cxyldqtv = -1260;break;}
        double result = Math.ceil((double) intValue); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
        return result;
    
}

    public static void main(String[] args) {
        IntegralValueCastingBug bugDemo = new IntegralValueCastingBug();
        int testValue = 42;
        double result = bugDemo.showBug(testValue);
        System.out.println("Result of Math.ceil on integral value: " + result);
    }
}