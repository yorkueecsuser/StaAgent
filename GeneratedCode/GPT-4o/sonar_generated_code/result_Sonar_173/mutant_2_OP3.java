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
            
            // Introduce an unreachable if statement
            boolean condition = getCondition();
            if (condition) {
                System.out.println("This block is unreachable.");
            }
            
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
    
    // Method to dynamically determine a condition at runtime
    private boolean getCondition() {
        return false; // This will always return false, making the if condition unreachable
    }

    public static void main(String[] args) {
        FinalizeMethodExample example = new FinalizeMethodExample();
        example.showBug();
    }
}