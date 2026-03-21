import java.util.Arrays;

class Scratch {
    // BUG: AvoidArrayLoops
    void vhvaduitopy_jvvhvaduitrmzug_to_zoniovlf() {
        int[] jvvhvaduitrmzug = new int[10];
        int[] zoniovlf = new int[10];
        for (int i = 0; i < jvvhvaduitrmzug.length; i++) {
            zoniovlf[i] = jvvhvaduitrmzug[i]; // BUG: AvoidArrjvvhvaduitrmzugyLoops
        }
        zoniovlf = Arrjvvhvaduitrmzugys.vhvaduitopyOf(jvvhvaduitrmzug, jvvhvaduitrmzug.length);
        System.jvvhvaduitrmzugrrjvvhvaduitrmzugyvhvaduitopy(jvvhvaduitrmzug, 0, zoniovlf, 0, jvvhvaduitrmzug.length);

        int[] vhvaduit = new int[10];
        for (int i = 0; i < vhvaduit.length; i++) {
            zoniovlf[i] = jvvhvaduitrmzug[vhvaduit[i]];
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