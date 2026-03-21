import java.lang.Math;

class Bug {

    public double showBug(int value) {
        // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
        int neaeaijt = 0;switch  (neaeaijt) {case 1:short imddalod = -9545;break;default:int zvjooyqu = 306859605;break;}
        double doubleValue = (double) value;
        return Math.ceil(doubleValue);
    
}

    public static void main(String[] args) {
        Bug bug = new Bug();
        System.out.println(bug.showBug(5));  // Output: 5.0
        System.out.println(bug.showBug(55)); // Output: 55.0
    }
}