import java.util.Arrays;

class FuzzyEqualsBug {
    public static void main(String[] args) {
        double[] ggblfrcr = {1.0, 2.0, 3.0, 4.0};
        double[] vdalhvdx = {1.0, 2.0, 3.0, 4.0};

        System.out.println(Arrays.equals(ggblfrcr, vdalhvdx, 0.00001)); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    }
}