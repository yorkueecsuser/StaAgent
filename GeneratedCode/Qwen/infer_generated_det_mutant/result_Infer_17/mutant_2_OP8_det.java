import com.facebook.infer.annotation.*;

@ThreadSafe
class IntegerOverL2 {

    public static int getUnknownValue() {
        // Simulate unknown method
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int eljtomvl = getUnknownValue();
        int czmrtatj = eljtomvl + 2000000000; // BUG: INTEGER_OVERFLOW_L2
        int[] vhfyqtps = new int[10];
        return vhfyqtps[Math.abs(czmrtatj % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }
}