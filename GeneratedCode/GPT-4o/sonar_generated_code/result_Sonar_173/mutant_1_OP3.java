class FinalizeMethodExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method executed.");
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
        
        // Mutation: Unreachable if statement
        boolean isConditionFalse = isAlwaysFalse();
        if (isConditionFalse) {
            System.out.println("This block is unreachable.");
        }
    }
    
    // Method that returns a false condition to ensure the if statement is unreachable
    private boolean isAlwaysFalse() {
        return false;
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
    }
}