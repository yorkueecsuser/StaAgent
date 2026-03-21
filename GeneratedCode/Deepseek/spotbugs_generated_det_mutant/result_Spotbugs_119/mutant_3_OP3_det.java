import java.lang.Double;

class DoubleLongBitsToDoubleInvokedOnInt {

    // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
    public double showBug() {
if (true && true && true && false && false && false && true && false && false && true && false) {int oendtwpj = -348440979;}

        return Double.longBitsToDouble(1234567890);
    
}

    public static void main(String[] args) {
        DoubleLongBitsToDoubleInvokedOnInt obj = new DoubleLongBitsToDoubleInvokedOnInt();
        System.out.println(obj.showBug());
    }
}