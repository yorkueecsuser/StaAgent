class NullPointerExample {

    public void showBug() {
        String str = null;
        
        // Introduced an equivalent do-while loop that does nothing
        int i = 0;
        do {
            // Empty loop body
        } while (i < 0); // Condition is always false, so the loop does not execute

        int length = str.length(); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            example.showBug();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}