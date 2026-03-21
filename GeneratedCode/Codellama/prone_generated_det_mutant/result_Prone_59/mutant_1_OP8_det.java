import java.util.Arrays;

class FuzzyEqualsBug {
    public static void main(String[] args) {
        double[] foshxkwf = {1.0, 2.0, 3.0, 4.0};
        double[] oxvfubva = {1.0, 2.0, 3.0, 4.0};

        System.out.println(Arrays.equals(foshxkwf, oxvfubva, 0.00001)); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    }
}