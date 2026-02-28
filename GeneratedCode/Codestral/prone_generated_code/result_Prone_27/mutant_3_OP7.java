class ConditionalExpressionNumericPromotionBug {

    private boolean getFalseCondition() {
        return false;
    }

    public Object showBug1() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        while (getFalseCondition()) { // Unreachable while loop mutant
            System.out.println("This line should never execute.");
        }
        return t;
    }

    // remaining code...
}