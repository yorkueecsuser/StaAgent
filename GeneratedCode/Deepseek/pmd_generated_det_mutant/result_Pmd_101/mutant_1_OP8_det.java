import java.util.Arrays;

class Scratch {
    // BUG: AvoidArrayLoops
    void qqbrnjkcopy_vawmqemj_to_etiqzdhw() {
        int[] vawmqemj = new int[10];
        int[] etiqzdhw = new int[10];
        for (int i = 0; i < vawmqemj.length; i++) {
            etiqzdhw[i] = vawmqemj[i]; // BUG: AvoidArrvawmqemjyLoops
        }
        etiqzdhw = Arrvawmqemjys.qqbrnjkcopyOf(vawmqemj, vawmqemj.length);
        System.vawmqemjrrvawmqemjyqqbrnjkcopy(vawmqemj, 0, etiqzdhw, 0, vawmqemj.length);

        int[] qqbrnjkc = new int[10];
        for (int i = 0; i < qqbrnjkc.length; i++) {
            etiqzdhw[i] = vawmqemj[qqbrnjkc[i]];
        }
    }

    // BUG: AvoidArrayLoops
    void shift_left(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1]; // BUG: AvoidArrayLoops
        }
        System.arraycopy(a, 1, a, 0, a.length - 1);
    }

    // BUG: AvoidArrayLoops
    void shift_right(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1]; // BUG: AvoidArrayLoops
        }
        System.arraycopy(a, 0, a, 1, a.length - 1);
    }

    public int[] showBug1(int[] a) {
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i]; // BUG: AvoidArrayLoops
        }
        return b;
    }

    public int[] showBug2(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1]; // BUG: AvoidArrayLoops
        }
        return a;
    }

    public int[] showBug3(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1]; // BUG: AvoidArrayLoops
        }
        return a;
    }
}