import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

class VolatileBug {
    private volatile int[] vInts; // Noncompliant - BUG: Non-primitive fields should not be "volatile"
    private volatile MyObj myObj; // Noncompliant - BUG: Non-primitive fields should not be "volatile"

    public VolatileBug(int[] vInts, MyObj myObj) {
        this.vInts = vInts;
        this.myObj = myObj;
    }

    public void showBug() {
        System.out.println("Volatile int array: " + Arrays.toString(vInts));
        System.out.println("Volatile object: " + myObj);
    }

    private static class MyObj {
        private int value;

        public MyObj(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "MyObj{value=" + value + "}";
        }
    }
}