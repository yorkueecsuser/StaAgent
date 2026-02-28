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

            // Mutation: Unreachable if-else statement
            boolean condition = getAlwaysFalseCondition();
            if (condition) {
                System.out.println("This unreachable code block will never run.");
            } else {
                System.out.println("This reachable code block always runs.");
            }

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeMethodExample example = new FinalizeMethodExample();
        example.showBug();
    }

    // Helper method to ensure the condition is always false at runtime
    public boolean getAlwaysFalseCondition() {
        return false;
    }
}