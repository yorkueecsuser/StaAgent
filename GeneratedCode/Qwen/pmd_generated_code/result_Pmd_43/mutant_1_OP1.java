class FinalizeExample {

    protected void finalize() {
        System.out.println("Finalizing FinalizeExample");
        // BUG: FinalizeDoesNotCallSuperFinalize
        // Dead Store Mutation
        String abcdabcd = "unused"; // Dead store variable
    }

    public void showBug() {
        try {
            FinalizeExample example = new FinalizeExample();
            example = null;
            System.gc(); // Suggesting garbage collection to demonstrate finalize
            // Dead Store Mutation
            int efghijkl = 42; // Dead store variable
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeExample demo = new FinalizeExample();
        demo.showBug();
        // Dead Store Mutation
        boolean lmnopqrs = true; // Dead store variable
    }
}