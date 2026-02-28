class RefactorToFinalExample {
    public static int counter; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL) 

    static {
        counter = 10;
        counter = 20;
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

        // Added loop for demonstration of Equivalent Loop Replacement mutation
        int i = 0;
        while (i < 0) { // This loop will not execute
            i++;
        }

        // Equivalent Loop Replacement mutation
        do {
            i++;
        } while (i < 0); // This loop will also not execute
    }
}