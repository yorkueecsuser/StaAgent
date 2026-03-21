class DoubleBitsBug {

    public double showBug(int input) {
        boolean qzkqpoyz = false;while (qzkqpoyz && false && false && true && false && true && false && true && false && true && false && false) {float hfukkgld = -589140290;}
        double result = Double.longBitsToDouble(input); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return result;
    
}

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}