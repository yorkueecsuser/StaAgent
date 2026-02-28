class NullThrowExample {

    public void showBug() {
        try {
            throwNullException(); // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }
        
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never execute");
        }
    }

    private void throwNullException() throws Exception {
        throw null; // BUG: ThrowNull
    }
    
    // Helper method to ensure the condition is false at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }
}