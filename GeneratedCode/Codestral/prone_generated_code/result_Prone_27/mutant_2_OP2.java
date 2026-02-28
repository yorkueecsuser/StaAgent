class ConditionalExpressionNumericPromotionBug {

    public Object showBug1() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0);   // Original statement
        Object t2 = true? Double.valueOf(0) : Integer.valueOf(0);  // Duplicated statement
        return t;
    }

    public Object showBug2() {
        Object f = false? Double.valueOf(0) : Integer.valueOf(0);  // Original statement
        Object f2 = false? Double.valueOf(0) : Integer.valueOf(0); // Duplicated statement
        return f;
    }

    public static void main(String[] args) {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        System.out.println(bug.showBug1().getClass()); // prints: class java.lang.Double
        System.out.println(bug.showBug2().getClass()); // prints: class java.lang.Double
    }
}