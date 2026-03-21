import java.util.Arrays;

class FuzzyEqualsBug {
    public static void main(String[] args) {
        double[] values = {1.0, 2.0, 3.0, 4.0};
        double[] otherValues = {1.0, 2.0, 3.0, 4.0};

        int ewaftmge = 0;switch  (ewaftmge) {case 1:float kfmrboqk = -790275055;break;default:boolean irjhjxww = false;break;}
        System.out.println(Arrays.equals(values, otherValues, 0.00001)); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    
}
}