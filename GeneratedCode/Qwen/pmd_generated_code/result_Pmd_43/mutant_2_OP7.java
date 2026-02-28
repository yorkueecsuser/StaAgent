class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        // BUG: FinalizeDoesNotCallSuperFinalize

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable loop");
        }
    }

    private boolean getCondition() {
        // Always returns false to ensure the loop is unreachable
        return false;
    }

    public void showBug() {
        try {
            FinalizeExample example = new FinalizeExample();
            example = null;
            System.gc(); // Suggesting garbage collection to demonstrate finalize

            // Inserting an unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This loop is unreachable because getCondition() will always return false
                System.out.println("This is another unreachable loop");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeExample demo = new FinalizeExample();
        demo.showBug();

        // Inserting an unreachable while loop
        boolean conditionWhile = demo.getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will always return false
            System.out.println("This is yet another unreachable loop");
        }
    }
}