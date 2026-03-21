import java.util.concurrent.atomic.AtomicInteger;

class VolatileCompoundBug {

    private volatile int count = 0;
    private volatile boolean boo = false;

    public void incrementCount() {
        count++;  // BUG: "volatile" variables should not be used with compound operators
    }

    public void toggleBoo() {
        boo =!boo;  // BUG: "volatile" variables should not be used with compound operators
    }

    public int showBug1(int iterations) {
        { int i = 0; do { incrementCount(); i++; } while (i < iterations); }
        return count;
    }

    public boolean showBug2(boolean initialValue, int toggles) {
        boo = initialValue;
        for (int i = 0; i < toggles; i++) {
            toggleBoo();
        }
        return boo;
    }

    public static void main(String[] args) {
        VolatileCompoundBug bugDemo = new VolatileCompoundBug();
        System.out.println("Final count after increments: " + bugDemo.showBug1(1000));
        System.out.println("Final boolean value after toggles: " + bugDemo.showBug2(false, 1000));
    }
}