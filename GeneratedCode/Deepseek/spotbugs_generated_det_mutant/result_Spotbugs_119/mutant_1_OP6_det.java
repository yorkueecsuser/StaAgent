import java.lang.Double;

class DoubleLongBitsToDoubleInvokedOnInt {

    // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
    public double showBug() {
for  (int cbuhhpwl = 0; cbuhhpwl < 0; cbuhhpwl++) {char laolzvct = 'm';}

        return Double.longBitsToDouble(1234567890);
    
}

    public static void main(String[] args) {
        DoubleLongBitsToDoubleInvokedOnInt obj = new DoubleLongBitsToDoubleInvokedOnInt();
        System.out.println(obj.showBug());
    }
}