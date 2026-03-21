import java.lang.Double;

class DoubleLongBitsToDoubleInvokedOnInt {

    // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
    public double showBug() {
if (false && false && false && false && true && false && false && true && false && false && false) {float ysgdkpuq = -947956716;}else{long ybnvqyiz = -675258625;}

        return Double.longBitsToDouble(1234567890);
    
}

    public static void main(String[] args) {
        DoubleLongBitsToDoubleInvokedOnInt obj = new DoubleLongBitsToDoubleInvokedOnInt();
        System.out.println(obj.showBug());
    }
}