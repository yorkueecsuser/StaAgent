// Bug: INTEGER_OVERFLOW_L2
class IntegerOverflowL2 {

    public static int getUnknownValue() {
        // Simulate unknown method
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }
public int showBug() {
    int x = getUnknownValue();
    int y = x + 2000000000;
    int [] arr = new int [ 10 ];
    arr = new int [ 10 ];
    return arr [ Math.abs(y % 10)];
}

    public static void main(String[] args) {
        IntegerOverflowL2 obj = new IntegerOverflowL2();
        obj.showBug();
    }
}