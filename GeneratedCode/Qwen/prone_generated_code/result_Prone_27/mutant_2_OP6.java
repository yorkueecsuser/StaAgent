class ConditionalExpressionBug {

    public Object showBug() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(t.getClass());  // class java.lang.Double

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
            System.out.println("This is an unreachable loop");
        }

        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(f.getClass());  // class java.lang.Double

        // Inserting another unreachable for loop
        boolean anotherConditionFor = getAnotherCondition();
        for (int j = 0; anotherConditionFor; j++) {
            // This loop is also unreachable because anotherConditionFor will always be false
            System.out.println("This is another unreachable loop");
        }

        return new Object[]{t, f};
    }

    private boolean getCondition() {
        return false;
    }

    private boolean getAnotherCondition() {
        return false;
    }

    public static void main(String[] args) {
        ConditionalExpressionBug bugDemo = new ConditionalExpressionBug();
        bugDemo.showBug();
    }
}