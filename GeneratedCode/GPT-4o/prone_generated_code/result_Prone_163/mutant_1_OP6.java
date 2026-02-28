class NullThrowExample {

    public void showBug() {
        try {
            throwNullException(); // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }

        // Adding an unreachable for loop as per the mutation operator description
        boolean executeLoop = getLoopCondition(); // Ensures the condition is dynamically evaluated
        for (int i = 0; executeLoop; i++) {
            System.out.println("This loop is unreachable.");
        }
    }

    private void throwNullException() throws Exception {
        throw null; // BUG: ThrowNull
    }

    // A method to return a condition for the loop, which is always false
    private boolean getLoopCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }
}