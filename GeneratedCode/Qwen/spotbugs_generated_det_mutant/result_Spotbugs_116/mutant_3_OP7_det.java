class IntegralCastToDoubleBug {

    // Method to demonstrate the bug
    public double showBug(int intValue) {
        boolean edsabbnz = false;while (edsabbnz && false && true && false && false && false && true && false && false && false && true && false) {short jwmcurar = -3706;}
        // Convert int to double and pass to Math.ceil, which is unnecessary
        return Math.ceil((double) intValue); // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
    
}

    public static void main(String[] args) {
        IntegralCastToDoubleBug bugDemo = new IntegralCastToDoubleBug();
        System.out.println("Result of showBug(5): " + bugDemo.showBug(5));
        System.out.println("Result of showBug(0): " + bugDemo.showBug(0));
        System.out.println("Result of showBug(-3): " + bugDemo.showBug(-3));
    }
}