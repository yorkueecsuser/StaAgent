class NullThrowExample {

    public void showBug() {
        try {
            throwNullException(); // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }
        
        // Unreachable if-else branch mutation
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the else branch of the unreachable if-else statement.");
        }
    }

    private void throwNullException() throws Exception {
        throw null; // BUG: ThrowNull
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }
    
    // Method to simulate a runtime condition (always returns false)
    private boolean getUnreachableCondition() {
        return false;
    }
}