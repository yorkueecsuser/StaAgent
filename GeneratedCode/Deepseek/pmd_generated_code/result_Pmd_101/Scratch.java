import java.util.Arrays;

class Scratch {
    // BUG: AvoidArrayLoops
    void copy_a_to_b() {
        int[] q = new int[10];
        int[] w = new int[10];
        for (int i = 0; i < q.length; i++) {
            w[i] = q[i]; // BUG: AvoidArrayLoops
        }
        w = Arrays.copyOf(q, q.length);
        System.arraycopy(q, 0, w, 0, q.length);

        int[] e = new int[10];
        for (int i = 0; i < e.length; i++) {
            w[i] = q[e[i]];
        }
    }

    // BUG: AvoidArrayLoops
    void shift_left(int[] q) {
        for (int i = 0; i < q.length - 1; i++) {
            q[i] = q[i + 1]; // BUG: AvoidArrayLoops
        }
        System.arraycopy(q, 1, q, 0, q.length - 1);
    }

    // BUG: AvoidArrayLoops
    void shift_right(int[] q) {
        for (int i = q.length - 1; i > 0; i--) {
            q[i] = q[i - 1]; // BUG: AvoidArrayLoops
        }
        System.arraycopy(q, 0, q, 1, q.length - 1);
    }

    public int[] showBug1(int[] q) {
        int[] w = new int[10];
        for (int i = 0; i < q.length; i++) {
            w[i] = q[i]; // BUG: AvoidArrayLoops
        }
        return w;
    }

    public int[] showBug2(int[] q) {
        for (int i = 0; i < q.length - 1; i++) {
            q[i] = q[i + 1]; // BUG: AvoidArrayLoops
        }
        return q;
    }

    public int[] showBug3(int[] q) {
        for (int i = q.length - 1; i > 0; i--) {
            q[i] = q[i - 1]; // BUG: AvoidArrayLoops
        }
        return q;
    }
}