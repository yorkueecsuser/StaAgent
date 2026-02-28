class FinalizeMethodExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method executed.");
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    }

    public void showBug() {
        try {
            FinalizeMethodExample example = new FinalizeMethodExample();
            example.dispose();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeMethodExample example = new FinalizeMethodExample();
        example.showBug();
        
        // Mutation: Adding an unreachable if statement
        boolean condition = getCondition(); // Dynamic condition to avoid compile-time error
        if (condition) {
            System.out.println("This block is unreachable because condition is always false");
        }
    }
    
    // Helper method to provide a dynamic condition
    private static boolean getCondition() {
        return false; // Always returns false to ensure the if block is unreachable
    }
}