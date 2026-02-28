class RefactorToFinalExample {
    public static int counter; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL) 

    static {
        counter = 10;
        counter = 20;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
    }

    public RefactorToFinalExample() {
        counter = 30;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
    }

    public int showBug() {
        return counter;
    }

    public static void main(String[] args) {
        RefactorToFinalExample example = new RefactorToFinalExample();
        System.out.println("Counter value: " + example.showBug());
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
    }

    private static boolean getCondition() {
        return false;
    }
}