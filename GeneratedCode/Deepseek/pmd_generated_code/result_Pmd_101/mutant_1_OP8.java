import java.util.Arrays;

class Scratch {
    // BUG: AvoidArrayLoops
    void copy_a_to_b() {
        int[] x = new int[10];
        int[] y = new int[10];
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i]; // BUG: AvoidArrayLoops
        }
        y = Arrays.copyOf(x, x.length);
        System.arraycopy(x, 0, y, 0, x.length);

        int[] z = new int[10];
        for (int i = 0; i < z.length; i++) {
            y[i] = x[z[i]];
        }
    }

    // BUG: AvoidArrayLoops
    void shift_left(int[] x) {
        for (int i = 0; i < x.length - 1; i++) {
            x[i] = x[i + 1]; // BUG: AvoidArrayLoops
        }
        System.arraycopy(x, 1, x, 0, x.length - 1);
    }

    // BUG: AvoidArrayLoops
    void shift_right(int[] x) {
        for (int i = x.length - 1; i > 0; i--) {
            x[i] = x[i - 1]; // BUG: AvoidArrayLoops
        }
        System.arraycopy(x, 0, x, 1, x.length - 1);
    }

    public int[] showBug1(int[] x) {
        int[] y = new int[10];
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i]; // BUG: AvoidArrayLoops
        }
        return y;
    }

    public int[] showBug2(int[] x) {
        for (int i = 0; i < x.length - 1; i++) {
            x[i] = x[i + 1]; // BUG: AvoidArrayLoops
        }
        return x;
    }

    public int[] showBug3(int[] x) {
        for (int i = x.length - 1; i > 0; i--) {
            x[i] = x[i - 1]; // BUG: AvoidArrayLoops
        }
        return x;
    }
}