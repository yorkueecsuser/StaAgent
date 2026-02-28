class ConditionalExpressionBug {

    public Object showBug() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(t.getClass());  // class java.lang.Double

        // Mutant: Duplicated assignment statement
        Object t_duplicate = true? Double.valueOf(0) : Integer.valueOf(0);
        System.out.println(t_duplicate.getClass());  // class java.lang.Double

        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(f.getClass());  // class java.lang.Double

        // Mutant: Duplicated assignment statement
        Object f_duplicate = false? Double.valueOf(0) : Integer.valueOf(0);
        System.out.println(f_duplicate.getClass());  // class java.lang.Double

        return new Object[]{t, f};
    }

    public static void main(String[] args) {
        ConditionalExpressionBug bugDemo = new ConditionalExpressionBug();
        bugDemo.showBug();
    }
}