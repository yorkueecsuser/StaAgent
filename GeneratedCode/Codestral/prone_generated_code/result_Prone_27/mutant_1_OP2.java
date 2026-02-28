class ConditionalExpressionNumericPromotionBug {

    public Object showBug1() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // Original line
        Object t_duplicate = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: Duplication
        return t;
    }

    public Object showBug2() {
        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // Original line
        Object f_duplicate = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: Duplication
        return f;
    }

    // Remaining code remains unchanged
}