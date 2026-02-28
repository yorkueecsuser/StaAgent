class RefactorToFinalExample {
    public static int counter; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL) 

    static {
        counter = 10;
        counter = 20;
        boolean condition = getCondition(); // Inserting unreachable if branch
        if (condition) {
            counter = 40; // This line is unreachable
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
        return false; // This method ensures the condition is dynamically determined but returns false
    }
}