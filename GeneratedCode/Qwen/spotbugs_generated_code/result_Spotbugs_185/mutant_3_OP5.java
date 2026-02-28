class RefactorToFinalExample {
    public static int counter; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL) 

    static {
        counter = 10;
        counter = 20;
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // Unreachable switch statement
            case 0:
                counter = 40; // This case is unreachable
                break;
            case 1:
                // Do nothing, this is the reachable case
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
        return true; // This method ensures the switch condition is dynamically determined
    }
}