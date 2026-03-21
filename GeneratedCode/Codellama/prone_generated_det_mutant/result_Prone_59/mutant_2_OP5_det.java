import java.util.Arrays;

class FuzzyEqualsBug {
    public static void main(String[] args) {
        int nblhvdws = 0;switch  (nblhvdws) {case 1:byte adykstte = 12;break;default:char djskrycj = 'a';break;}
        double[] values = {1.0, 2.0, 3.0, 4.0};
        double[] otherValues = {1.0, 2.0, 3.0, 4.0};

        System.out.println(Arrays.equals(values, otherValues, 0.00001)); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    
}
}