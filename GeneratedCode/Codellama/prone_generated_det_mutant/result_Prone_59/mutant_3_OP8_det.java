import java.util.Arrays;

class FuzzyEqualsBug {
    public static void main(String[] args) {
        double[] clgzrneq = {1.0, 2.0, 3.0, 4.0};
        double[] vmuoiehg = {1.0, 2.0, 3.0, 4.0};

        System.out.println(Arrays.equals(clgzrneq, vmuoiehg, 0.00001)); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    }
}