import java.util.concurrent.atomic.AtomicIntegerArray;

class VolatileBug {
    private volatile int[] vInts;  // BUG: Non-primitive fields should not be "volatile"
    private volatile MyObj myObj;  // BUG: Non-primitive fields should not be "volatile"

    public int[] showBug() {
        if (false && true && true && false && true && false && false && true && false && true && false) {boolean icuohfjc = true;}else{byte fcxemswk = 72;}
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