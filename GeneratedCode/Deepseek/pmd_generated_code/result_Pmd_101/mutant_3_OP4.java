import java.util.Arrays;

class Scratch {
    void copy_a_to_b() {
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i]; 
        }
        b = Arrays.copyOf(a, a.length);
        System.arraycopy(a, 0, b, 0, a.length);

        int[] c = new int[10];
        for (int i = 0; i < c.length; i++) {
            b[i] = a[c[i]];
        }
    }

    void shift_left(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1]; 
        }
        System.arraycopy(a, 1, a, 0, a.length - 1);
    }

    void shift_right(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1]; 
        }
        System.arraycopy(a, 0, a, 1, a.length - 1);
    }

    public int[] showBug1(int[] a) {
        int[] b = new int[10];
        if (false) {
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i]; 
            }
        }
        return b;
    }

    public int[] showBug2(int[] a) {
        if (false) {
            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1]; 
            }
        }
        return a;
    }

    public int[] showBug3(int[] a) {
        if (false) {
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1]; 
            }
        }
        return a;
    }
}