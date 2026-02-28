import java.util.Arrays;

class Scratch {
    // BUG: AvoidArrayLoops
    void copy_a_to_b() {
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i]; // BUG: AvoidArrayLoops
        }
        b = Arrays.copyOf(a, a.length);
        System.arraycopy(a, 0, b, 0, a.length);

        int[] c = new int[10];
        for (int i = 0; i < c.length; i++) {
            b[i] = a[c[i]];
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

    // Unreachable for loop mutant
    public int[] showBug1(int[] a) {
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        for (boolean condition = false; condition; ) {
            System.out.println("Unreachable code");
        }
        return b;
    }

    // Unreachable for loop mutant
    public int[] showBug2(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        for (boolean condition = false; condition; ) {
            System.out.println("Unreachable code");
        }
        return a;
    }

    // Unreachable for loop mutant
    public int[] showBug3(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        for (boolean condition = false; condition; ) {
            System.out.println("Unreachable code");
        }
        return a;
    }
}