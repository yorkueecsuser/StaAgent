import java.util.Arrays;

class Scratch {
    // BUG: AvoidArrayLoops
    void copy_a_to_b() {
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i]; // BUG: AvoidArrayLoops
            b[i] = a[i]; // Duplicated assignment statement
        }
        b = Arrays.copyOf(a, a.length);
        System.arraycopy(a, 0, b, 0, a.length);

        int[] c = new int[10];
        for (int i = 0; i < c.length; i++) {
            b[i] = a[c[i]];
            b[i] = a[c[i]]; // Duplicated assignment statement
        }
    }

    // BUG: AvoidArrayLoops
    void shift_left(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1]; // BUG: AvoidArrayLoops
            // other stuff
            System.out.println("Shifting left...");
            a[i] = a[i + 1]; // Duplicated assignment statement
        }
        System.arraycopy(a, 1, a, 0, a.length - 1);
    }

    // BUG: AvoidArrayLoops
    void shift_right(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1]; // BUG: AvoidArrayLoops
            a[i] = a[i - 1]; // Duplicated assignment statement
        }
        System.arraycopy(a, 0, a, 1, a.length - 1);
    }

    public int[] showBug1(int[] a) {
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i]; // BUG: AvoidArrayLoops
            b[i] = a[i]; // Duplicated assignment statement
        }
        return b;
    }

    public int[] showBug2(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1]; // BUG: AvoidArrayLoops
            a[i] = a[i + 1]; // Duplicated assignment statement
        }
        return a;
    }

    public int[] showBug3(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1]; // BUG: AvoidArrayLoops
            a[i] = a[i - 1]; // Duplicated assignment statement
        }
        return a;
    }
}