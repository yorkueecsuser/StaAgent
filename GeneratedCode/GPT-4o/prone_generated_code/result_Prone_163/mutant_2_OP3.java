class NullThrowExample {

    public void showBug() {
        try {
            throwNullException(); // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }
        
        // Inserted unreachable if statement
        boolean isUnreachable = getCondition(); // Non-final variable for control structure
        if (isUnreachable) {
            System.out.println("This is an unreachable code block.");
        }
    }

    private void throwNullException() throws Exception {
        throw null; // BUG: ThrowNull
    }

    private boolean getCondition() {
        return false; // Method returns false, making the if condition unreachable
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }
}