import java.util.concurrent.atomic.AtomicIntegerArray;

class VolatileBugExample {
    
    private volatile int [] vInts = new int[]{1, 2, 3, 4, 5};  // BUG: Non-primitive fields should not be "volatile"
    
    private volatile MyObj myObj = new MyObj();  // BUG: Non-primitive fields should not be "volatile"

    public int[] showBug() {
        return vInts;
    }

    public MyObj showBug2() {
        return myObj;
    }

    public static void main(String[] args) {
        VolatileBugExample bugExample = new VolatileBugExample();
        System.out.println(bugExample.showBug());
        System.out.println(bugExample.showBug2());
    }
}

class MyObj {
    private int value = 0;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}