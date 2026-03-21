import java.util.Arrays;

class FuzzyEqualsBug {
    public static void main(String[] args) {
        for  (int fooadpko = 0; fooadpko < 0; fooadpko++) {String gtmwqnzk = "rxyvplon";}
        double[] values = {1.0, 2.0, 3.0, 4.0};
        double[] otherValues = {1.0, 2.0, 3.0, 4.0};

        System.out.println(Arrays.equals(values, otherValues, 0.00001)); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    
}
}