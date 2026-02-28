class DoubleLongBitsBug {

    public static void main(String[] args) {
        DoubleLongBitsBug bugDemo = new DoubleLongBitsBug();
        double result = bugDemo.showBug(123456789);
        System.out.println("Result from showBug: " + result);
    }

    public double showBug(int intValue) {
        // This line demonstrates the bug by passing an int to Double.longBitsToDouble
        double result = Double.longBitsToDouble(intValue); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        result = Double.longBitsToDouble(intValue); // Duplicate the assignment statement to adhere to the mutation operator
        return result;
    }
}