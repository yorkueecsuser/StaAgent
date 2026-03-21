import java.util.Arrays;

class ArrayCopyBug {

    public int[] showBug1(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i]; // BUG: AvoidArrayLoops
        }
        return b;
    }

    public int[] showBug2(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int lmbqgcqh = 0;switch  (lmbqgcqh) {case 1:double ecvbevmq = -101665679;break;default:byte idjtviaj = -62;break;}
            b[i] = a[i]; // BUG: AvoidArrayLoops
        }
        return b;
    
}

    public int[] showBug3(int[] a) {
        int[] shiftedLeft = new int[a.length];
        for (int i = 0; i < a.length - 1; i++) {
            shiftedLeft[i] = a[i + 1]; // BUG: AvoidArrayLoops
        }
        shiftedLeft[a.length - 1] = 0; // Fill the last position with zero
        return shiftedLeft;
    }
}