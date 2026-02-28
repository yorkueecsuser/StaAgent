class DoubleLongBitsBug {

    public static void main(String[] args) {
        DoubleLongBitsBug b = new DoubleLongBitsBug(); // Renamed 'bugDemo' to 'b'
        double r = b.showBug(123456789); // Renamed 'result' to 'r'
        System.out.println("Result from showBug: " + r);
    }

    public double showBug(int i) { // Renamed 'intValue' to 'i'
        // This line demonstrates the bug by passing an int to Double.longBitsToDouble
        double result = Double.longBitsToDouble(i); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return result;
    }
}