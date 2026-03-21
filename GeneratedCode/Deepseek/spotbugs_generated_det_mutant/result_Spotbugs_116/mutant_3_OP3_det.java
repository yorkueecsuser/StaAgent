import java.lang.Math;

class Bug {

    public double showBug(int value) {
        // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
        if (false && false && false && true && true && true && false && true && false && false && false) {double osdbzojw = -851487525;}
        double doubleValue = (double) value;
        return Math.ceil(doubleValue);
    
}

    public static void main(String[] args) {
        Bug bug = new Bug();
        System.out.println(bug.showBug(5));  // Output: 5.0
        System.out.println(bug.showBug(55)); // Output: 55.0
    }
}