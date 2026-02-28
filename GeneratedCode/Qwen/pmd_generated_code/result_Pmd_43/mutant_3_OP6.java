class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        // BUG: FinalizeDoesNotCallSuperFinalize

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
            System.out.println("This is an unreachable loop iteration.");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        try {
            FinalizeExample example = new FinalizeExample();
            example = null;
            System.gc(); // Suggesting garbage collection to demonstrate finalize
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeExample demo = new FinalizeExample();
        demo.showBug();
    }
}