class FinalizeExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
        super.finalize();
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if the condition is true
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable if-else branch");
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public String showBug() {
        try {
            dispose();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return "Check console for finalize method invocation";
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        example.showBug();
    }
}