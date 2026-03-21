import java.lang.Double;

class DoubleLongBitsToDoubleInvokedOnInt {

    // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
    public double showBug() {
int jvaipcqb = 0;switch  (jvaipcqb) {case 1:boolean pizngvpp = true;break;default:float mmgnheqp = 499972753;break;}

        return Double.longBitsToDouble(1234567890);
    
}

    public static void main(String[] args) {
        DoubleLongBitsToDoubleInvokedOnInt obj = new DoubleLongBitsToDoubleInvokedOnInt();
        System.out.println(obj.showBug());
    }
}