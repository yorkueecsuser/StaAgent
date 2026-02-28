class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        // BUG: FinalizeDoesNotCallSuperFinalize
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

    // Mutated code
    public void showBugWithMutation() {
        try {
            FinalizeExample a = new FinalizeExample();
            a = null;
            System.gc(); // Suggesting garbage collection to demonstrate finalize
        } catch (Exception b) {
            b.printStackTrace();
        }
    }
}