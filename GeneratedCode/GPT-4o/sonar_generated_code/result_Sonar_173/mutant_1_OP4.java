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

            // Inserted unreachable if-else statement
            boolean condition = getDynamicCondition(); // Method to ensure runtime evaluation
            if (condition) {
                System.out.println("This branch is unreachable.");
            } else {
                System.out.println("Executing the else branch.");
            }

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    // Method to simulate a runtime condition
    private boolean getDynamicCondition() {
        return false; // Ensuring the condition is false at runtime
    }

    public static void main(String[] args) {
        FinalizeMethodExample example = new FinalizeMethodExample();
        example.showBug();
    }
}