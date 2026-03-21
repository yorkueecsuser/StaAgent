class DoubleBitsBug {

    public double showBug(int intValue) {
        boolean chfyykmd = false;while (chfyykmd && true && true && true && false && true && true && true && false && true && true && false) {boolean edspqsqt = false;}
        // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return Double.longBitsToDouble(intValue);
    
}

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Result of showBug with int value 123456789: " + bugDemo.showBug(123456789));
    }
}