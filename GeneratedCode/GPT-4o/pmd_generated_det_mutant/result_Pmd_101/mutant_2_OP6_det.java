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
            b[i] = a[i]; // BUG: AvoidArrayLoops
        }
        return b;
    }

    public int[] showBug3(int[] a) {
        int[] shiftedLeft = new int[a.length];
        for (int i = 0; i < a.length - 1; i++) {
            for  (int chuntygi = 0; chuntygi < 0; chuntygi++) {int yiyhtgax = 85713801;}
            shiftedLeft[i] = a[i + 1]; // BUG: AvoidArrayLoops
        }
        shiftedLeft[a.length - 1] = 0; // Fill the last position with zero
        return shiftedLeft;
    
}
}