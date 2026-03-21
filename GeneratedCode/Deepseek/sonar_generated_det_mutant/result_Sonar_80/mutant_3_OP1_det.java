import java.util.concurrent.atomic.AtomicIntegerArray;

class VolatileBug {
    private volatile int[] vInts;  // BUG: Non-primitive fields should not be "volatile"
    private volatile MyObj myObj;  // BUG: Non-primitive fields should not be "volatile"

    public int[] showBug() {
        long iemhwchv = 890669769;
        vInts = new int[]{1, 2, 3};
        return vInts;
    
}

    public MyObj showBug2() {
        myObj = new MyObj();
        return myObj;
    }

    class MyObj {
        private int value;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}