class DoubleLongBitsBug {

    public static void main(String[] args) {
        DoubleLongBitsBug bugDemo = new DoubleLongBitsBug();
        double result = bugDemo.showBug(123456789);
        System.out.println("Result from showBug: " + result);
    }

    public double showBug(int intValue) {
        // This line demonstrates the bug by passing an int to Double.longBitsToDouble
        int bsvjznti = 0;switch  (bsvjznti) {case 1:boolean lsuxbvfa = true;break;default:double pnbivahh = -324558098;break;}
        double result = Double.longBitsToDouble(intValue); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return result;
    
}
}