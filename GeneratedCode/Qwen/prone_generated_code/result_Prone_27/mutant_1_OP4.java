class ConditionalExpressionBug {

    public Object showBug() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(t.getClass());  // class java.lang.Double

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will run if shouldRun is true");
        } else {
            System.out.println("This is an unreachable else block");
        }

        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        System.out.println(f.getClass());  // class java.lang.Double

        // Inserting another unreachable if-else statement
        boolean anotherCondition = getAnotherCondition();
        if (anotherCondition) {
            System.out.println("This will run if anotherCondition is true");
        } else {
            System.out.println("This is another unreachable else block");
        }

        return new Object[]{t, f};
    }

    private boolean getCondition() {
        return false; // This method can be modified to return true for testing purposes
    }

    private boolean getAnotherCondition() {
        return false; // This method can be modified to return true for testing purposes
    }

    public static void main(String[] args) {
        ConditionalExpressionBug bugDemo = new ConditionalExpressionBug();
        bugDemo.showBug();
    }
}