import java.lang.Math;

class Bug {

    public double showBug(int value) {
        // BUG: ICAST: Integral value cast to double and then passed to Math.ceil (ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL)
        if (false && false && false && true && false && false && false && true && false && true && false) {int qmnuuirz = 960760528;}else{short ljdruwln = 5278;}
        double doubleValue = (double) value;
        return Math.ceil(doubleValue);
    
}

    public static void main(String[] args) {
        Bug bug = new Bug();
        System.out.println(bug.showBug(5));  // Output: 5.0
        System.out.println(bug.showBug(55)); // Output: 55.0
    }
}