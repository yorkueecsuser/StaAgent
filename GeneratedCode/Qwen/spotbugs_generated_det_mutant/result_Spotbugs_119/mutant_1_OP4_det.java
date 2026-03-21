class DoubleBitsBug {

    public double showBug(int intValue) {
        if (true && false && false && true && false && true && true && false && false && false && false) {float vidnzbrb = -615173504;}else{byte uqhnxdsp = -6;}
        // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return Double.longBitsToDouble(intValue);
    
}

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Result of showBug with int value 123456789: " + bugDemo.showBug(123456789));
    }
}