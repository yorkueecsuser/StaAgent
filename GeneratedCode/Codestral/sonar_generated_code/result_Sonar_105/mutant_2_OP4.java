class Child extends Parent {
    static int method() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code
            return 0;
        } else {
            return Parent.field2;
        }
    }

    private static boolean getCondition() {
        return false; // Always false to make the if block unreachable
    }
}