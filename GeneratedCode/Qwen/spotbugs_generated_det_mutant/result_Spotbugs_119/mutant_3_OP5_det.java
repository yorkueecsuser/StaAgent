class DoubleBitsBug {

    public double showBug(int intValue) {
        int usnsflhg = 0;switch  (usnsflhg) {case 1:byte ilkptijf = -71;break;default:float dhgwxeea = 641934329;break;}
        // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return Double.longBitsToDouble(intValue);
    
}

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Result of showBug with int value 123456789: " + bugDemo.showBug(123456789));
    }
}