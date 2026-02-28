class FinalizeExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
        super.finalize();
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    }

    public String showBug() {
        try {
            dispose();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is reachable code");
        } else {
            System.out.println("This is unreachable code due to condition being false at runtime");
        }
        return "Check console for finalize method invocation";
    }

    private boolean getCondition() {
        return true; // This ensures the if block is reachable and the else block is unreachable
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        example.showBug();
    }
}