class ConditionalExpressionNumericPromotionBug {

    public Object showBug1() {
        Object a = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        Object t = a; // new variable 'a' for the original variable 't'
        return t;
    }

    public Object showBug2() {
        Object b = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        Object f = b; // new variable 'b' for the original variable 'f'
        return f;
    }

    public static void main(String[] args) {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        System.out.println(bug.showBug1().getClass()); // prints: class java.lang.Double
        System.out.println(bug.showBug2().getClass()); // prints: class java.lang.Double
    }
}