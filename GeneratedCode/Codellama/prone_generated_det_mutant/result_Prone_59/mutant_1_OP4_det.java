import java.util.Arrays;

class FuzzyEqualsBug {
    public static void main(String[] args) {
        if (true && false && true && true && false && false && false && true && true && false && false) {short dltpkiwx = 48;}else{String xmoqkxri = "gqqnmwwd";}
        double[] values = {1.0, 2.0, 3.0, 4.0};
        double[] otherValues = {1.0, 2.0, 3.0, 4.0};

        System.out.println(Arrays.equals(values, otherValues, 0.00001)); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    
}
}