class DoubleLongBitsBug {

    public static void main(String[] args) {
        DoubleLongBitsBug b = new DoubleLongBitsBug(); // Renamed the variable "bugDemo" to "b"
        double result = b.showBug(123456789);
        System.out.println("Result from showBug: " + result);
    }

    public double showBug(int intValue) {
        // This line demonstrates the bug by passing an int to Double.longBitsToDouble
        double result = Double.longBitsToDouble(intValue); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return result;
    }
}