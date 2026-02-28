class NullThrowExample {

    public void showBug() {
        try {
            throwNullException(); // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }

        // Unreachable if statement mutant added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable block");
        }
    }

    private void throwNullException() throws Exception {
        throw null; // BUG: ThrowNull
    }

    // Helper method to ensure the condition is never true
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }
}