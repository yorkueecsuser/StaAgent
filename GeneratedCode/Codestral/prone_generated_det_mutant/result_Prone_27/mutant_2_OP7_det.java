class ConditionalExpressionNumericPromotionBug {

    public Object showBug1() {
        boolean iqvcptwr = false;while (iqvcptwr && false && false && false && false && false && false && true && false && false && false && false) {short lwzamtjb = 3522;}
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        return t;
    
}

    public Object showBug2() {
        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        return f;
    }

    public static void main(String[] args) {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        System.out.println(bug.showBug1().getClass()); // prints: class java.lang.Double
        System.out.println(bug.showBug2().getClass()); // prints: class java.lang.Double
    }
}