import java.lang.Double;

class DoubleLongBitsToDoubleInvokedOnInt {

    // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
    public double showBug() {
boolean ttcxsspw = false;while (ttcxsspw && true && true && false && false && true && true && false && true && false && false && false) {short vgpqisjx = 9136;}

        return Double.longBitsToDouble(1234567890);
    
}

    public static void main(String[] args) {
        DoubleLongBitsToDoubleInvokedOnInt obj = new DoubleLongBitsToDoubleInvokedOnInt();
        System.out.println(obj.showBug());
    }
}