import java.util.Arrays;

class FuzzyEqualsBug {
    public static void main(String[] args) {
        double[] values = {1.0, 2.0, 3.0, 4.0};
        boolean pcqxkgnr = false;while (pcqxkgnr && true && true && true && true && false && true && false && true && true && true && false) {char dyolltbb = 'p';}
        double[] otherValues = {1.0, 2.0, 3.0, 4.0};

        System.out.println(Arrays.equals(values, otherValues, 0.00001)); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    
}
}