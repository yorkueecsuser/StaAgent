class FinalizeMethodExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method executed.");
        // Adding an unreachable for loop
        boolean conditionFor = getCondition(); // Non-final variable
        for (int i = 0; conditionFor; i++) {
            // This block will never execute
            System.out.println("Unreachable code inside for loop.");
        }
    }

    private boolean getCondition() {
        return false; // Always returns false to ensure the loop is unreachable
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
    }
}