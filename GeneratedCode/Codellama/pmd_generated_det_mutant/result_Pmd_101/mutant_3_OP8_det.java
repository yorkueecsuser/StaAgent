import java.util.Arrays;

class AvoidArrayLoops {
    public static void main(String[] args) {
        int[] xtqajmcv = {1, 2, 3, 4, 5};
        int[] ihabunbw = new int[xtqajmcv.length];

        // BUG: AvoidArrayLoops
        for (int i = 0; i < xtqajmcv.length; i++) {
            ihabunbw[i] = xtqajmcv[i];
        }

        System.out.println(Arrays.toString(ihabunbw));
    }
}