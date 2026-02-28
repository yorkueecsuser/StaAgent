class FinalizeMethodExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method executed.");
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called

        // Inserting unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This will never be executed.");
        } else {
            // Original code remains unaffected
        }
    }

    // Method to simulate a condition that always returns false
    private boolean getUnreachableCondition() {
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