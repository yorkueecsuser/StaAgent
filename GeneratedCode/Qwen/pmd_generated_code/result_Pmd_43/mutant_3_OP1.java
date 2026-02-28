class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        // BUG: FinalizeDoesNotCallSuperFinalize
        // Dead Store Mutation
        String abcdefgh = "unusedVariable"; // Dead store mutation
    }

    public void showBug() {
        try {
            FinalizeExample example = new FinalizeExample();
            example = null;
            System.gc(); // Suggesting garbage collection to demonstrate finalize
            // Dead Store Mutation
            int ijklmnop = 42; // Dead store mutation
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeExample demo = new FinalizeExample();
        demo.showBug();
        // Dead Store Mutation
        boolean opqrstuv = true; // Dead store mutation
    }
}