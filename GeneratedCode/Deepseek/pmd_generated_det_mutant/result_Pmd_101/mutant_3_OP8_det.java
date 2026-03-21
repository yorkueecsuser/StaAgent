import java.util.Arrays;

class Scratch {
    // BUG: AvoidArrayLoops
    void pmnbxtesopy_rilhsxmmtrtldpz_to_sxmmtrtl() {
        int[] rilhsxmmtrtldpz = new int[10];
        int[] sxmmtrtl = new int[10];
        for (int i = 0; i < rilhsxmmtrtldpz.length; i++) {
            sxmmtrtl[i] = rilhsxmmtrtldpz[i]; // BUG: AvoidArrrilhsxmmtrtldpzyLoops
        }
        sxmmtrtl = Arrrilhsxmmtrtldpzys.pmnbxtesopyOf(rilhsxmmtrtldpz, rilhsxmmtrtldpz.length);
        System.rilhsxmmtrtldpzrrrilhsxmmtrtldpzypmnbxtesopy(rilhsxmmtrtldpz, 0, sxmmtrtl, 0, rilhsxmmtrtldpz.length);

        int[] pmnbxtes = new int[10];
        for (int i = 0; i < pmnbxtes.length; i++) {
            sxmmtrtl[i] = rilhsxmmtrtldpz[pmnbxtes[i]];
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