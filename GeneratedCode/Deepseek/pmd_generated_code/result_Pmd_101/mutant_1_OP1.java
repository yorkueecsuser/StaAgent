import java.util.Arrays;

class Scratch {
    // BUG: AvoidArrayLoops
    void copy_a_to_b() {
        int[] a = new int[10];
        int[] b = new int[10];
        String deadVariable1 = "abcdefgh"; // Dead Store Mutation
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i]; // BUG: AvoidArrayLoops
        }
        b = Arrays.copyOf(a, a.length);
        System.arraycopy(a, 0, b, 0, a.length);

        int[] c = new int[10];
        String deadVariable2 = "ijklmnop"; // Dead Store Mutation
        for (int i = 0; i < c.length; i++) {
            b[i] = a[c[i]];
        }
    }

    // BUG: AvoidArrayLoops
    void shift_left(int[] a) {
        String deadVariable3 = "qrstuvwx"; // Dead Store Mutation
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1]; // BUG: AvoidArrayLoops
        }
        System.arraycopy(a, 1, a, 0, a.length - 1);
    }

    // BUG: AvoidArrayLoops
    void shift_right(int[] a) {
        String deadVariable4 = "yzabcd12"; // Dead Store Mutation
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1]; // BUG: AvoidArrayLoops
        }
        System.arraycopy(a, 0, a, 1, a.length - 1);
    }

    public int[] showBug1(int[] a) {
        int[] b = new int[10];
        String deadVariable5 = "34efgh56"; // Dead Store Mutation
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i]; // BUG: AvoidArrayLoops
        }
        return b;
    }

    public int[] showBug2(int[] a) {
        String deadVariable6 = "78ijkl90"; // Dead Store Mutation
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1]; // BUG: AvoidArrayLoops
        }
        return a;
    }

    public int[] showBug3(int[] a) {
        String deadVariable7 = "zxcvbnmq"; // Dead Store Mutation
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1]; // BUG: AvoidArrayLoops
        }
        return a;
    }
}