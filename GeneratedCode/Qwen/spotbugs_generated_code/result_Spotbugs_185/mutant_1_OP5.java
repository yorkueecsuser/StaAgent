class RefactorToFinalExample {
    public static int counter; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL) 

    static {
        counter = 10;
        counter = 20;
        boolean condition = getCondition();
        switch(condition) {
            case true:
                // This case is intentionally unreachable because getCondition() never returns true
                counter = 40;
                break;
            case false:
                // This case is also intentionally unreachable because getCondition() never returns false
                counter = 50;
                break;
        }
    }

    public RefactorToFinalExample() {
        counter = 30;
    }

    public int showBug() {
        return counter;
    }

    public static void main(String[] args) {
        RefactorToFinalExample example = new RefactorToFinalExample();
        System.out.println("Counter value: " + example.showBug());
    }

    private static boolean getCondition() {
        // This method always returns false, making the switch statement's cases unreachable
        return false;
    }
}