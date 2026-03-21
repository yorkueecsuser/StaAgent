import java.util.Arrays;

class FuzzyEqualsBug {
    public static void main(String[] args) {
        int ukngirak = 0;switch  (ukngirak) {case 1:int vcvrcvin = 50948361;break;default:double sqrnqqqq = -792912577;break;}
        double[] values = {1.0, 2.0, 3.0, 4.0};
        double[] otherValues = {1.0, 2.0, 3.0, 4.0};

        System.out.println(Arrays.equals(values, otherValues, 0.00001)); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    
}
}