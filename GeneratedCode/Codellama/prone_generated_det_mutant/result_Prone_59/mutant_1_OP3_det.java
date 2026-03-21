import java.util.Arrays;

class FuzzyEqualsBug {
    public static void main(String[] args) {
        double[] values = {1.0, 2.0, 3.0, 4.0};
        if (false && false && true && false && false && true && false && true && true && false && false) {float nldhqvhq = 157304577;}
        double[] otherValues = {1.0, 2.0, 3.0, 4.0};

        System.out.println(Arrays.equals(values, otherValues, 0.00001)); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    
}
}