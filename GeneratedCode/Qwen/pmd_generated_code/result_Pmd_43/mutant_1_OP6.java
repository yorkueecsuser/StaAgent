class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        // BUG: FinalizeDoesNotCallSuperFinalize

        // Introduced Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public void showBug() {
        try {
            FinalizeExample example = new FinalizeExample();
            example = null;
            System.gc(); // Suggesting garbage collection to demonstrate finalize

            // Introduced Unreachable for loop mutant
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This loop is unreachable because conditionFor will always be false
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeExample demo = new FinalizeExample();
        demo.showBug();

        // Introduced Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
        }
    }

    private static boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}